USE db_clinica;

INSERT INTO tb_medico(numero_crm, estado_crm, nome_medico)
VALUES (451247,'df','gustavo'),
	   (471586,'go','victoria'),
       (482586,'sp','marcia'),
       (471696,'go','paulo');
SELECT * FROM db_clinica.tb_medico;
       
INSERT INTO tb_paciente(nome_paciente, data_nascimento, sexo, cep, cidade, estado, complemento)
VALUES ('João Jóse', '1980-04-26', 'M', 74846594, 'Gama', 'DF', ''),
	   ('Carlos Eduardo', '1982-04-26', 'M', 74846594, 'Ceilandia', 'DF', ''),
	   ('Paloma Dantas', '1983-04-26', 'M', 74846594, 'Asa Sul', 'DF', ''),
       ('Maria Nazare', '1977-03-14', 'F', 74846594, 'Taguatinga', 'DF', 'M Norte');
SELECT * FROM db_clinica.tb_paciente;

INSERT INTO tb_especialidade(nome_especialidade)
VALUES ('Cardiologia'),
	   ('Pediatria'),
       ('Ortopedia'),
       ('Fono');
SELECT * FROM db_clinica.tb_especialidade;

INSERT INTO tb_consulta(id_consulta, data_hora, numero_crm, estado_crm, id_paciente)
VALUES (DEFAULT, '2024-07-20 14:15:00', 451247, 'df', 1 ),
	   (DEFAULT, '2024-07-20 14:15:00', 451247, 'df', 2 ),
	   (DEFAULT, '2022-04-10 17:15:00', 451247, 'df', 1 ),
	   (DEFAULT, '2023-09-20 14:15:00', 471586, 'go', 1 ),
	   (DEFAULT, '2021-12-02 15:30:00', 471586, 'go', 2 );
SELECT * FROM db_clinica.tb_consulta;

INSERT INTO tb_telefone(numero_telefone, id_paciente)
VALUES (6133764361, 1),
	   (6133777856, 2),
	   (6133447851, 3),
	   (6133778954, 1);
SELECT * FROM db_clinica.tb_telefone;

INSERT INTO tb_medico_especialidade(id_especialidade, numero_crm, estado_crm)
VALUES (1, 451247, 'df'),
	   (2, 451247, 'df'),
	   (3, 471586, 'go'),
       (4, 471586, 'go');
SELECT * FROM tb_medico_especialidade;

# DROP TABLE tb_especialidade;
# DROP DATABASE clinica;