package com.autenticacao.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autenticacao.DTOs.CriarUsuarioDTO;
import com.autenticacao.DTOs.RecoveryJwtTokenDTO;
import com.autenticacao.DTOs.UsuarioLoginDTO;
import com.autenticacao.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioControler {

    @Autowired
    private UsuarioService usuarioService;


    @PostMapping("/login")
    public ResponseEntity<RecoveryJwtTokenDTO> autenticarUsuario(@RequestBody UsuarioLoginDTO usuarioLoginDTO);

    return new ResponseEntity<>token, HttpStatus.ok;

}

@PostMapping()
public ResponseEntity<void> criarUsuario(@RequestBody CriarUsuarioDTO criarUsuarioDTO){
    usuarioService.CriarUsuario(criarUsuarioDTO);
    return new ResponseEntity<>(HttpStatus.CREATED);
}