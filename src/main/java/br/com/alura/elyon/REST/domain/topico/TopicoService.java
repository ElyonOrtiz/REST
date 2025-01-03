package br.com.alura.elyon.REST.domain.topico;

import br.com.alura.elyon.REST.domain.usuario.Usuario;
import br.com.alura.elyon.REST.domain.usuario.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TopicoService {

    private final TopicoRepository topicoRepository;
    private final UsuarioRepository usuarioRepository;

    public TopicoService(TopicoRepository topicoRepository, UsuarioRepository usuarioRepository) {
        this.topicoRepository = topicoRepository;
        this.usuarioRepository = usuarioRepository;
    }

    public Topico cadastrarPergunta(PerguntaDto perguntaDto) {
        Usuario autor = usuarioRepository.findById(perguntaDto.autor().getId())
                .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado"));

        Topico topico = new Topico();
        topico.setTitulo(perguntaDto.titulo());
        topico.setMensagem(perguntaDto.mensagem());
        topico.setCurso(perguntaDto.curso());
        topico.setAutor(autor);
        topico.setDataCriacao(LocalDateTime.now());
        topico.setStatus(false);

        return topicoRepository.save(topico);
    }
}
