package br.com.alura.elyon.REST.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("admin")
@RestController
@PreAuthorize("hasRole('ADMINISTRADOR')")
public class AdminController {

    public String adminOnly() {
        return "Acesso permitido apenas para administradores.";
    }
}