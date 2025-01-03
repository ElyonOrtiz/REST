package br.com.alura.elyon.REST.domain.usuario;

import br.com.alura.elyon.REST.domain.perfil.PerfilEnum;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.util.Set;

public record DadosCadastroAluno(
        @Email
        String email,
        @NotBlank
        String senha,
        @NotBlank
        String nome
) {
}
