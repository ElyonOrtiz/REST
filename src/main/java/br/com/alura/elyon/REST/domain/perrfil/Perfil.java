package br.com.alura.elyon.REST.domain.perrfil;


import br.com.alura.elyon.REST.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "Perfil")
@Table(name = "perfils")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private PerfilEnum especialidade;

    @ManyToMany(mappedBy = "perfils")
    private List<Usuario> usuarios;
}
