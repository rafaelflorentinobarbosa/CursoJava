CREATE DATABASE IF NOT EXISTS db_papelaria;
# DROP DATABASE db_papelaria;
USE db_papelaria;

CREATE TABLE IF NOT EXISTS tb_cliente(
	nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    email VARCHAR(150) NOT NULL,
    endereco VARCHAR(150),
    CONSTRAINT cliente_pk PRIMARY KEY(cpf)
)ENGINE = INNODB;

CREATE TABLE IF NOT EXISTS tb_funcionario(
	nome VARCHAR(100) NOT NULL,
    matricula INT NOT NULL,
    email VARCHAR(150) NOT NULL,
    funcao VARCHAR(100) NOT NULL,
    CONSTRAINT funcionario_pk PRIMARY KEY(matricula)
)ENGINE = INNODB;

CREATE TABLE IF NOT EXISTS tb_fornecedor(
	nome VARCHAR(100) NOT NULL,
    cnpj VARCHAR(11) NOT NULL,
    email VARCHAR(150) NOT NULL,
    telefone VARCHAR(15) NOT NULL,
    endereco VARCHAR(100) NOT NULL,
    CONSTRAINT fornecedor_pk PRIMARY KEY(cnpj)
)ENGINE = INNODB;

CREATE TABLE IF NOT EXISTS tb_produto(
	nome VARCHAR(100) NOT NULL,
    codigo INT NOT NULL,
    descricao VARCHAR(150) NOT NULL,
    preco DECIMAL(7, 2) NOT NULL,
    quantidade INT NOT NULL,
    validade DATE,
    cnpj_fornecedor VARCHAR(11) NOT NULL,
    CONSTRAINT produto_pk PRIMARY KEY(codigo),
    CONSTRAINT cnpj_fornecedor_fk FOREIGN KEY(cnpj_fornecedor) REFERENCES tb_fornecedor(cnpj) ON DELETE CASCADE	
)ENGINE = INNODB;

CREATE TABLE IF NOT EXISTS tb_venda(
    id_venda INT NOT NULL AUTO_INCREMENT,
	matricula_funcionario INT NOT NULL,
    cpf_cliente VARCHAR(11) NOT NULL,
    CONSTRAINT venda_pk PRIMARY KEY(id_venda),
    CONSTRAINT matricula_funcionario_fk FOREIGN KEY(matricula_funcionario) REFERENCES tb_funcionario(matricula) ON DELETE CASCADE,	
    CONSTRAINT cpf_cliente_fk FOREIGN KEY(cpf_cliente) REFERENCES tb_cliente(cpf) ON DELETE CASCADE	
)ENGINE = INNODB;

#lista_produtos VARCHAR(100) NOT NULL,

CREATE TABLE IF NOT EXISTS tb_venda_produto(
    id_venda INT NOT NULL,
	codigo_produto INT NOT NULL,
    quantidade INT NOT NULL 
)ENGINE = INNODB;


