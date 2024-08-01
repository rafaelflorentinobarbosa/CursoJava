package com.biblioteca.gerenciamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.gerenciamento.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {

}
