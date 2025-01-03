package br.com.alura.elyon.REST.domain.resposta;

import br.com.alura.elyon.REST.domain.topico.Topico;
import br.com.alura.elyon.REST.domain.topico.TopicoRepository;
import br.com.alura.elyon.REST.domain.usuario.Usuario;
import br.com.alura.elyon.REST.domain.usuario.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RespostaService {

    private final RespostaRepository respostaRepository;
    private final TopicoRepository topicoRepository;
    private final UsuarioRepository usuarioRepository;

    public RespostaService(RespostaRepository respostaRepository, TopicoRepository topicoRepository, UsuarioRepository usuarioRepository) {
        this.respostaRepository = respostaRepository;
        this.topicoRepository = topicoRepository;
        this.usuarioRepository = usuarioRepository;
    }

    public void cadastrarResposta(RespostaDto respostaDto) {
        Usuario autor = usuarioRepository.findById(respostaDto.autor().getId())
                .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado"));
        Topico topico = topicoRepository.findById(respostaDto.topicoId())
                .orElseThrow(() -> new IllegalArgumentException("Tópico não encontrado"));

        Resposta resposta = new Resposta();
        resposta.setMensagem(respostaDto.mensagem());
        resposta.setCriacao(LocalDateTime.now());
        resposta.setAutor(autor);
        resposta.setTopico(topico);

        respostaRepository.save(resposta);
    }
}
