package br.com.alura.elyon.REST.domain.topico;


import br.com.alura.elyon.REST.domain.curso.Curso;
import br.com.alura.elyon.REST.domain.resposta.Resposta;
import br.com.alura.elyon.REST.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "Topico")
@Table(name = "topicos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Usuario autor;

    @OneToMany(mappedBy = "topico")
    private List<Resposta> respostas;
}
