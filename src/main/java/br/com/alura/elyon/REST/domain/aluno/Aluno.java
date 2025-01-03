
package br.com.alura.elyon.REST.domain.aluno;

import br.com.alura.elyon.REST.domain.perfil.PerfilEnum;
import br.com.alura.elyon.REST.domain.usuario.DadosCadastroAluno;
import br.com.alura.elyon.REST.domain.usuario.Usuario;
import jakarta.persistence.Entity;

import java.util.Collections;

@Entity
public class Aluno extends Usuario {
    public Aluno(DadosCadastroAluno dadosCadastroAluno) {
        super(dadosCadastroAluno.email(), dadosCadastroAluno.senha(), dadosCadastroAluno.nome(), Collections.singleton(PerfilEnum.ALUNO));
    }
    public Aluno(){
        super();
    }
}
