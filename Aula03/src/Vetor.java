public class Vetor {
    public static void main(String[] args) throws Exception {
          

    // Vetor de inteiros, povoando e listando

        int tam = 10;
        int vetor[] = new int[tam];
        int i;

        for( i = 1; i < tam; i++){ // Povoando vetor
            vetor[i] = 10;
        }

        for( i = 1; i < tam; i++){ // Percorrendo e imprimendo valores do vetor
            System.out.print(vetor[i] + " ");
        }

    
    }
}
