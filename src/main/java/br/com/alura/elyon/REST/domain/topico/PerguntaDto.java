package br.com.alura.elyon.REST.domain.topico;

import br.com.alura.elyon.REST.domain.aluno.Aluno;
import br.com.alura.elyon.REST.domain.curso.Curso;
import br.com.alura.elyon.REST.domain.resposta.Resposta;

public record PerguntaDto<curso>(
    String titulo,
    String mensagem,
    Aluno autor,
    Curso curso
) {
}
