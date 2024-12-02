package br.com.alura.elyon.REST.domain.resposta;


import br.com.alura.elyon.REST.domain.usuario.Usuario;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity(name = "Resposta")
@Table(name = "respostas")
public class Resposta {

    private Long id;
    private String mensagem;

    private LocalDateTime criacao;
    private Usuario autor;

}
