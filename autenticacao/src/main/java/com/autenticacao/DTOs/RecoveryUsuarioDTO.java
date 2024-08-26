package com.autenticacao.DTOs;

import org.hibernate.mapping.List;

public record RecoveryUsuarioDTO(
    long id,
    String email,
    List<RuleModel> rules
) {

}
