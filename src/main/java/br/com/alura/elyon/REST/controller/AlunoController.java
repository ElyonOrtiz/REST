package br.com.alura.elyon.REST.controller;


import br.com.alura.elyon.REST.domain.aluno.Aluno;
import br.com.alura.elyon.REST.domain.usuario.DadosCadastroAluno;
import br.com.alura.elyon.REST.domain.usuario.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("aluno")
public class AlunoController {

    @Autowired
    UsuarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarAluno(@RequestBody @Valid DadosCadastroAluno dados) {
        repository.save(new Aluno(dados));
    }



}
