package com.autenticacao.DTOs;

import com.autenticacao.enuns.RulesEnum;

public record CriarUsuarioDTO(
    String email,
    String password,
    RulesEnum rules
) {
    
}
