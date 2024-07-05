USE db_papelaria;

# Buscar Vendedores
SELECT nome, matricula 
	FROM tb_funcionario
		WHERE funcao = 'Vendedor';

# Buscar Funcionários que realizaram vendas
SELECT f.nome
	FROM tb_funcionario f
		INNER JOIN tb_venda v
			WHERE f.matricula = v.matricula_funcionario;
            
select f.matricula, f.nome, f.funcao
	FROM tb_funcionario F LEFT JOIN tb_venda v
        ON f.matricula = v.matricula_funcionario
        WHERE v.matricula_funcionario IS NULL;

# Quero descobrir qual fornecedor teve mais produtos vendidos

    
