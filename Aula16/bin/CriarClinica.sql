CREATE DATABASE IF NOT EXISTS clinica;

USE clinica;

CREATE TABLE medico(
	numero_crm BIGINT NOT NULL,
    estado_crm CHAR(2) NOT NULL,
    nome_medico VARCHAR(100) NOT NULL,
    CONSTRAINT medico_pk PRIMARY KEY(numero_crm, estado_crm)
    
)ENGINE = INNODB;

CREATE TABLE paciente(
	id_paciente INT NOT NULL AUTO_INCREMENT,
    sexo ENUM('M','F') NOT NULL,
    cidade VARCHAR(30) NOT NULL,
    estado CHAR(2) NOT NULL,
    complemento VARCHAR(100),
    cep BIGINT NOT NULL,
    data_nascimento DATE NOT NULL,
    nome_paciente VARCHAR(100) NOT NULL,
    CONSTRAINT paciente_pk PRIMARY KEY(id)
)ENGINE = INNODB;

CREATE TABLE especialidade(
	nome_especialidade VARCHAR(30) NOT NULL,
    id_especialidade INT NOT NULL AUTO_INCREMENT,
    CONSTRAINT especialidade_pk PRIMARY KEY (id_especialidade)
)ENGINE = INNODB;

CREATE TABLE consulta(
	id_consulta INT NOT NULL AUTO_INCREMENT,
    data_hora TIMESTAMP NOT NULL,
    numero_crm BIGINT NOT NULL,
    estado_crm CHAR(2) NOT NULL,
    id_paciente INT NOT NULL,
    CONSTRAINT consulta_pk PRIMARY KEY(id_consulta),
    CONSTRAINT consulta_medico_fk FOREIGN KEY(numero_crm, estado_crm) REFERENCES medico(numero_crm, estado_crm) ON DELETE CASCADE,
	CONSTRAINT consulta_paciente_fk FOREIGN KEY(id_paciente) REFERENCES paciente(id) ON DELETE CASCADE
)ENGINE = INNODB;