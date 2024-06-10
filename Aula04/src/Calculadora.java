import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int primeiro = 0, segundo = 0;
        int resultado;

        double resDiv;
        
        int opcao = -1;

        while (opcao != 0) {

            opcao = entrada.nextInt();

            if(opcao != 0){
                System.out.println("Insira o primeiro numero");
                primeiro = entrada.nextInt();
    
                System.out.println("Insira o segundo numero");
                segundo = entrada.nextInt();
            }

            switch (opcao) {
                case 1: // Soma
                    resultado = primeiro + segundo;
                    System.out.println(resultado);
                    break;
                case 2: // Subtração
                    resultado = primeiro - segundo;
                    System.out.println(resultado);
                    break;
                case 3: // Multiplicação
                    resultado = primeiro * segundo;
                    System.out.println(resultado);                
                    break;    
                case 4: // Divisão
                    resDiv = (double)primeiro / (double)segundo;
                    System.out.printf("%.2f",resDiv);  
                    break; 
                case 5: // Potenciação
                    resDiv = Math.pow(primeiro, segundo);
                    System.out.printf("%.2f",resDiv);  
                    break; 
                case 0: // Sair
                    System.out.println("Encerrando.");              
                break;   

                default:
                    break;
            }
        }
        entrada.close();
    }
}
