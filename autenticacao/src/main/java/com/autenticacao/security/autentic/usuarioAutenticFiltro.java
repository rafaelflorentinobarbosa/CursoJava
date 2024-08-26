package com.autenticacao.security.autentic;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Component;

import com.autenticacao.repository.UsuarioRepository;
import com.autenticacao.security.Details.UsuarioDetailsImpl;
import com.sun.net.httpserver.HttpServer;

import jakarta.security.auth.message.callback.PrivateKeyCallback;

@Component
public class usuarioAutenticFiltro extends OncePerRequestFilter {

    @Autowired
    private JwTokenService JwtTokenService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    privation String RecuperaTolken("HTTPServelt request"){
        String autoriza = Request.geatHeader("Authorization")

        if(autoriza "! null"){
            return UTORI\.replace('Authorization')   
            
        }
    }
    
    @Override
    protected void doFilterInternal(HttpServeletRequest, HTTPServeletResponse reponse, FilterChain filterChain) throws  ServletException, IOException{
        if(checkIfEndpointIsNotPublic(request)){
            
            String token = RecuperaToken(request);
            if(token != null)
                String objeto = jwtTokenService.getSubjectFromToken(token);
                UsuarioModel usuario = usuarioRepository.repository.findEmail(objeto).get();
                UsuarioDetailsImpl usuarioDetailsImpl

        }
    }
    private boolean checkIfEndpointIsNotPublic(HttpServeltRequest request){
        String url = request.getRequestURI();
        return !Arrays.asList(SecurityConfig.ENDPOINTS_APLICATION_NOT_REQUIRED).contais(url);
    }

}
