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
 
 # Buscar funcionários que não realizaram vendas 
SELECT f.matricula, f.nome, f.funcao
	FROM tb_funcionario F LEFT JOIN tb_venda v
        ON f.matricula = v.matricula_funcionario
        WHERE v.matricula_funcionario IS NULL;

# Quero descobrir qual fornecedor teve mais produtos vendidos (mais unidades vendidas)
SELECT f.nome AS "Nome Fornecedor", SUM(vp.quantidade_vendido) AS total_produtos_vendidos
FROM tb_fornecedor f
	INNER JOIN	tb_produto p ON f.cnpj = p.cnpj_fornecedor
		INNER JOIN	tb_venda_produto vp ON p.codigo = vp.codigo_produto
			GROUP BY f.nome
				ORDER BY total_produtos_vendidos DESC
					LIMIT 1;


# Criando uma View
CREATE VIEW busca_funcionario AS 
	SELECT nome_funcionario, matricula
		FROM funcionario f LEFT JOIN tb_vendas v
			ON F.matricula = v.matricula
				WHERE v.matricula IS NULL;
