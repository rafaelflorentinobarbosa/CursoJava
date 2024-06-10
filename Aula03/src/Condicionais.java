public class Condicionais {
    public static void main(String[] args) {
        
        // Condicionais Lógicos

        int numero = -15;

        if(numero > 0 && numero < 100){
            System.out.println("O número avaliado está entre 0 e 100!");
        }else{
            System.out.println("O número avaliado não está entre 0 e 100!");
        }

        if(numero %2 == 0 || numero < 0){
            System.out.println("O número é par ou menor que zero!");
        }else{
            System.out.println("O número é impar!");
        }
        
    }
}
