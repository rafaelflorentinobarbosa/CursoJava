package com.biblioteca.gerenciamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.gerenciamento.model.LivroModel;
import com.biblioteca.gerenciamento.model.UsuarioModel;
import com.biblioteca.gerenciamento.repository.LivroRepository;
import com.biblioteca.gerenciamento.repository.UsuarioRepository;

@RestController
public class UsuarioController {
    @Autowired
    LivroRepository livroRepository;

    private UsuarioRepository usuarioRepository;

    @PostMapping("/adicionarusuario")
    public UsuarioModel addUsuario(@RequestBody UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    @GetMapping("/teste")
    public String teste(){
        return "Testando!!!";
    }

    @PostMapping("/adicionarlivro")
    public LivroModel addLivro(@RequestBody LivroModel livro){
        return livroRepository.save(livro);
    }

    @PostMapping("/listarlivro")
    public List<LivroModel>listarLivros(){
        return livroRepository.findAll();
    }

}
