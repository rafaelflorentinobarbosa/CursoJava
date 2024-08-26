package com.autenticacao.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autenticacao.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{

    Optional<UsuarioModel> findByEmail(String email);

}
