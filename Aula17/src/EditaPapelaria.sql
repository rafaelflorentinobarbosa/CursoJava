USE db_papelaria;

# Adicionar nova coluna na tabela
ALTER TABLE tb_cliente ADD telefone DECIMAL(11);

# Atualização Registro
UPDATE tb_cliente SET telefone = 12345678901 WHERE CPF = 11223344556;

UPDATE tb_cliente SET telefone = 12345678901 WHERE nome LIKE '%ana%';

# Deletar coluna
ALTER TABLE tb_cliente DROP COLUMN telefone;
ALTER TABLE tb_cliente DROP COLUMN cpf; # Não pode ser apagado pois possuem uma dependecia e venda FK

# Deletar linha
DELETE FROM tb_cliente WHERE CPF = 11223344566;

# Apagar todos os produtos abaxo de 6,00 do fornecedor A 

DELETE FROM tb_produto WHERE preco < 6 AND cnpj_fornecedor = '34567890000134';