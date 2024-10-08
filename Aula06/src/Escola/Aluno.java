package Escola;

public class Aluno {
    private String nome;
    private int idade;
    private double nota1;
    private double nota2;

    public Aluno(String nome, int idade, double nota1, double nota2) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setNota1(nota1);
        this.setNota2(nota2);
    }

    public void media(){
        double media = (nota1 + nota2)/2;
        if(media >= 7){
            System.out.printf("Aprovado. Sua média foi: %.2f", media);
        }else{
            System.out.printf("Reprovado. Sua média foi: %.2f", media);
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }    
    
}
