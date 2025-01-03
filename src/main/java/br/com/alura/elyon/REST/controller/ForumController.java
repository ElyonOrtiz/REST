package br.com.alura.elyon.REST.controller;



import br.com.alura.elyon.REST.domain.resposta.RespostaDto;
import br.com.alura.elyon.REST.domain.resposta.RespostaService;
import br.com.alura.elyon.REST.domain.topico.PerguntaDto;
import br.com.alura.elyon.REST.domain.topico.Topico;
import br.com.alura.elyon.REST.domain.topico.TopicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("forum")
public class ForumController {

    private final TopicoService topicoService;
    private final RespostaService respostaService;

    public ForumController(TopicoService topicoService, RespostaService respostaService) {
        this.topicoService = topicoService;
        this.respostaService = respostaService;
    }

    @PostMapping("/cadastrar")
    @PreAuthorize("hasRole('ALUNO')")
    public ResponseEntity<String> cadastrarPergunta(@RequestBody PerguntaDto perguntaDto) {
        Topico topico = topicoService.cadastrarPergunta(perguntaDto);
        return ResponseEntity.ok("Pergunta cadastrada com sucesso! ID: " + topico.getId());
    }

    @PostMapping("/responder")
    @PreAuthorize("hasAnyRole('ALUNO', 'PROFESSOR', 'MODERADOR')")
    public ResponseEntity<String> responderPergunta(@RequestBody RespostaDto respostaDto) {
        respostaService.cadastrarResposta(respostaDto);
        return ResponseEntity.ok("Resposta cadastrada com sucesso!");
    }
}
