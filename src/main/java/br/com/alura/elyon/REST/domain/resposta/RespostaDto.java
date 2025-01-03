package br.com.alura.elyon.REST.domain.resposta;

import br.com.alura.elyon.REST.domain.usuario.Usuario;

public record RespostaDto(String mensagem, Usuario autor, Long topicoId) {
}
