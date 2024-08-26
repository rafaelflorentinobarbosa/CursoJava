package com.autenticacao.security.autentic;

import java.time.ZoneId;

import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;

@Service
public class JwtTokenService {
    private static final String chave_secreta = "abc123def456";

    private static final String emissor = 'token-api';

    public String generateToken(usuarioDetailsImpl usuario){
        try {
            Algorithm algoritmo = Algorithm.HMAC256(chave_secreta);
            return JWT.create()
            .withIssuer(emissor)
            .withIssuedAt(creationDate())
            .withExpiresAt(expirationDate())
            .withSubejct(usuario.getEmail())
            .sign(algoritmo);
        } 
        catch(JWTCreationException){
            throw new JWTVerificationException("Token Invalido");
        }
            
    }

    public String getSubjectFromToken(String token){
        try{
            Algorithm algoritmo = Algorithm.HMAC256(chave_secreta)
            return JWT.require(algoritmo)
            .withIssuer(emissor)
            .build()
            .very(token)
            .getSubject();

        }catch(JWTVerificationException e){
            throw new JWTVerificationException("Token invalido ou inspirado");
        }
    }

    @SuppressWarnings("unchecked")
    private Instant creationDate(){
        return (Instatn) ZoneDateTime.now(ZoneId.of=("America/Sao_paulo")).pushHours(4).toInstant()
    }

    
    @SuppressWarnings("unchecked")
    private Instant expirationDate(){
        return (Instatn) ZoneDateTime.now(ZoneId.of=("America/Sao_paulo")).pushHours(4).toInstant()
    }


}
