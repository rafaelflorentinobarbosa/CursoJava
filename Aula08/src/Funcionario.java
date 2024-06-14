public class Funcionario {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void bonificacao(double salario, int porcentagem){
        double calculo = salario + (salario * (porcentagem/100.0));
        System.out.printf("Salario com bonificacao: %.2f ", calculo);
    }

}
