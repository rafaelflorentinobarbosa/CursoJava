package Escola;

import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;
        double nota1, nota2;

        //Aluno aluno1 = new Aluno("Pedro",19,9.5,9.3);
        
        System.out.println("Digite o nome do aluno: ");
        nome = entrada.nextLine();
        System.out.println("Digite a idade do aluno: ");
        idade = entrada.nextInt();
        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();

        Aluno aluno1 = new Aluno(nome, idade, nota1, nota2);

        System.out.println("O nome do aluno é: "+aluno1.getNome());
        System.out.println("A idade do aluno é: "+aluno1.getIdade());

        aluno1.media();
        
        entrada.close();

    }
}
