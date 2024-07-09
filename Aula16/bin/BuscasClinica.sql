USE db_clinica;

CREATE VIEW medicos_cardiologistas(nome_medico, numero_crm, estado_crm)
	AS SELECT m.nome_medico, m.numero_crm, m.estado_crm FROM tb_medico m, tb_medico_especialidade pe
		WHERE m.numero_crm = pe.numero_crm AND pe.id_especialidade = 1;
        
SELECT * FROM medicos_cardiologistas;

SELECT nome_paciente FROM tb_paciente;
SELECT * FROM tb_paciente;
SELECT * FROM tb_paciente WHERE nome_paciente ="Carlos Eduardo"; 
SELECT * FROM tb_paciente WHERE nome_paciente LIKE '%Eduardo%';

