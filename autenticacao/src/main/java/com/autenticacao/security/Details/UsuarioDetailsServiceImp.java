package com.autenticacao.security.Details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.autenticacao.model.UsuarioModel;
import com.autenticacao.repository.UsuarioRepository;

public class UsuarioDetailsServiceImp implements UserDetailsService{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws 
UsernameNotFoundException{
    UsuarioModel usuario = usuarioRepository.findByEmail(username).orElseThrow(()-> new RuntimeException("Usuário não encontrado") );
        return new UsuarioDetailsImpl(usuario);
    }
}
