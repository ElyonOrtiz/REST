package br.com.alura.elyon.REST.domain.resposta;

import br.com.alura.elyon.REST.domain.topico.Topico;
import br.com.alura.elyon.REST.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity(name = "Resposta")
@Table(name = "respostas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Resposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mensagem;

    private LocalDateTime criacao;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Usuario autor;

    @ManyToOne
    @JoinColumn(name = "topico_id")
    private Topico topico;

    public void setMensagem(String mensagem) {
    }

    public void setCriacao(LocalDateTime now) {
    }

    public void setAutor(Usuario autor) {
    }

    public void setTopico(Topico topico) {
    }
}
