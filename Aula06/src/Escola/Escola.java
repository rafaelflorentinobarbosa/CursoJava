package Escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro",19,9.5,9.3);
        
        System.out.println("O nome do aluno é: "+aluno1.getNome());
        System.out.println("A idade do aluno é: "+aluno1.getIdade());

        aluno1.media();

    }
}
