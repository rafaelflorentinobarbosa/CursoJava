package com.autenticacao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import com.autenticacao.DTOs.RecoveryJwtTokenDTO;
import com.autenticacao.model.UsuarioModel;
import com.autenticacao.repository.UsuarioRepository;
import com.autenticacao.security.autentic.JwtTokenService;
import com.autenticacao.security.config.SegurancaConfig;

@Service
public class UsuarioService {
    @Autowired
    private Authentificationmanager authentificationmanager;

    @Autowired
    private JwtTokenService jktTokenService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private SegurancaConfig segurancaConfig;

    public RecoveryJwtTokenDTO authenticateUsuario(UsuarioLoginDTO UsuarioLoginDTO){
        UsernamePasswordAuthenticationToken usuarioPassword = new usernamePasswordAutenticationToken(UsuarioLoginDTO.email(),UsuarioLoginDTO.password());

        Authentication authentication = AuthenticationManager.authenticate(usuarioPassword);

        UsuarioDetailsImpl usuarioDetailsImpl = (usuarioDetailsImpl) authentification,gerPrincipal();

        return new RecoveryJwtTolkenDTO(jwtTokenService.generateToken(usuarioDetailsImpl));
    }
    public void CriarUsuario(CriarUsuarioDTO criarUsuarioDTO){
        UsuarioModel usuarioModel = UsuarioModel.builder()
         usuarioModel = UsuarioModel.builder()
         .email(criarUsuarioDTO.email)
         .password(segurança.passwordEncoder().encode(criarUsuarioDTO.password()))
         .rules(List.of(RulemModel.builder).name(criarUsuarioDTO.rules()).build())
         .build();

         usuarioRepository.save(usarioModel);
    }
}
