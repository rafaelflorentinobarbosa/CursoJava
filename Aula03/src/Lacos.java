public class Lacos {
    public static void main(String[] args) {
        
        // Laço de repetição FOR

        int contador;
         for(contador = 0; contador < 10; contador++){
            System.out.println(contador);
         }

        // Laço de repetição WHILE
         while (contador < 100) {
            System.out.print(contador+" ");
            contador++;
            if(contador == 51){
                break;
            }
         }
        // Laço de repetição DO WHILE
        do {
            System.out.println(contador);
            contador++;
        }while(contador == 0);

      
    }
}
