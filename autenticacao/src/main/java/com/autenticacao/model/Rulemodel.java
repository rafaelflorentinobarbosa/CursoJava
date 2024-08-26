package com.autenticacao.model;

import com.autenticacao.enuns.RulesEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;


@Entity
@Table(name="rules")
@Builder
//@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Rulemodel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private RulesEnum tipo;

}
