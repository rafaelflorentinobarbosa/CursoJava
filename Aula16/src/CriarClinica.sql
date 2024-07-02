CREATE DATABASE IF NOT EXISTS db_clinica;

USE db_clinica;

CREATE TABLE IF NOT EXISTS tb_medico (
	numero_crm BIGINT NOT NULL,
    estado_crm CHAR(2) NOT NULL,
    nome_medico VARCHAR(100) NOT NULL,
    CONSTRAINT medico_pk PRIMARY KEY(numero_crm, estado_crm)
)ENGINE = INNODB;

CREATE TABLE IF NOT EXISTS tb_paciente (
	id_paciente INT NOT NULL AUTO_INCREMENT,
    sexo ENUM('M','F') NOT NULL,
    cidade VARCHAR(30) NOT NULL,
    estado CHAR(2) NOT NULL,
    complemento VARCHAR(100),
    cep BIGINT NOT NULL,
    data_nascimento DATE NOT NULL,
    nome_paciente VARCHAR(100) NOT NULL,
    CONSTRAINT paciente_pk PRIMARY KEY(id_paciente)
)ENGINE = INNODB;

CREATE TABLE IF NOT EXISTS tb_especialidade  (
	nome_especialidade VARCHAR(30) NOT NULL,
    id_especialidade INT NOT NULL AUTO_INCREMENT,
    CONSTRAINT especialidade_pk PRIMARY KEY (id_especialidade)
)ENGINE = INNODB;

CREATE TABLE IF NOT EXISTS tb_consulta (
	id_consulta INT NOT NULL AUTO_INCREMENT,
    data_hora TIMESTAMP NOT NULL,
    numero_crm BIGINT NOT NULL,
    estado_crm CHAR(2) NOT NULL,
    id_paciente INT NOT NULL,
    CONSTRAINT consulta_pk PRIMARY KEY(id_consulta),
    CONSTRAINT consulta_medico_fk FOREIGN KEY(numero_crm, estado_crm) REFERENCES tb_medico(numero_crm, estado_crm) ON DELETE CASCADE,
	CONSTRAINT consulta_paciente_fk FOREIGN KEY(id_paciente) REFERENCES tb_paciente(id_paciente) ON DELETE CASCADE
)ENGINE = INNODB;

CREATE TABLE tb_telefone(
	numero_telefone DECIMAL(11) NOT NULL,
    id_paciente INT NOT NULL,
    CONSTRAINT numero_telefone_uk UNIQUE(numero_telefone, id_paciente),
    CONSTRAINT numero_telefone_paciente_fk FOREIGN KEY(id_paciente) REFERENCES tb_paciente(id_paciente) ON DELETE CASCADE
)ENGINE = INNODB;


CREATE TABLE tb_medico_especialidade(
	id_especialidade INT NOT NULL,
    numero_crm BIGINT NOT NULL,
    estado_crm CHAR(2) NOT NULL,
    CONSTRAINT medico_especialidade_uk UNIQUE (id_especialidade, numero_crm, estado_crm),
    CONSTRAINT medico_medico_especialidade_fk FOREIGN KEY(numero_crm, estado_crm) REFERENCES tb_medico(numero_crm, estado_crm) ON DELETE CASCADE,
    CONSTRAINT especialidade_medico_especialidade_fk FOREIGN KEY(id_especialidade) REFERENCES tb_especialidade(id_especialidade) ON DELETE CASCADE
)ENGINE = INNODB;

# DROP TABLE tb_medico_especialidade;