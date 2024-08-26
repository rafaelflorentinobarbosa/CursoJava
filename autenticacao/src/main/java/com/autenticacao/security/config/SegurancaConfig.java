package com.autenticacao.security.config;

import java.security.Security;

import org.hibernate.metamodel.spi.MappingMetamodelImplementor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.autenticacao.security.autentic.usuarioAutenticFiltro;

@Configuration
@EnableWebSecurity
public class SegurancaConfig {
    public static final String [] ENDPOINT_AUTHENTICATION_NOT_REQUIRED = 
    {
        "/usuario/login",
        "/usuariocreat"
    };

    public static final String [] ENDPOINT_AUTHENTICATION_NOT_REQUIRED = 
    {
        "/usuario/teste"
        
    };

    public static final String [] ENDPOINT_CLIENTE = {
        "/usuario/teste/cliente"
    };
    public static final String [] ENDPOINT_ADMIN = {
        "/usuario/teste/admin"
    };

    @Bean
    public SecurityFilterChain securityFilter(HttpSecurity httpSecurity)throws Exception{
        return httpSecurity( csrf-> csrf.diable())
        .sessionManagment(management -> management.sessionCreationPolicy(SessionCreationPolicy.
        STATELESS))
        .authorizeHttpRequests(authorize -> authorize.requesstMatchers(
         ENDPOINT_AUTHENTICATION_NOT_REQUIRED).permitAll()
         .authorizeHttpRequests(authorize -> authorize.requesstMatchers(
         ENDPOINT_AUTHENTICATION_NOT_REQUIRED).permitAll().anyRequest().authenticated())
         .authorizeHttpRequest(authorize -> authorize.requesstMatchers(ENDPOINT_ADMIN).hasRole
         ("Admin"))
         .authorizeHttpRequest(authorize -> authorize.requesstMatchers(ENDPOINT_CLIENTE).hasRole
         ("Cliente"))
         addFilterBefore(usuarioAutenticFiltro, UsernamePasswordAuthenticationFilter.class)
         .build();
    }
    @Bean
    public AuthentificattionManger AuthentificattionManger(){
        return new AuthentificattionManger();
    }

    @Bean
    public PasswordEncoder PassworEncoder(){
        return new BCrypPasswordEncoder();
    }

    
}
