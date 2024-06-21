package tryCatch;
public class App {
    public static void main(String[] args) throws Exception {
       
        // Tratamento de Erros - Divisão por 0
        try {
            System.out.println(7/0);

        } catch (Exception e) {
            System.err.println("Erro na divisão!");
            System.err.println(e);
        }

        System.err.println("Passou do Erro.\n");

        // Erro de segmentação de memória, passou do limite do vetor.

        try {
            int[] vetor = new int[3];
            for (int i = 0; i < 4; i++) {
                vetor[i] = i;
                System.out.println(vetor[i]);
            }
            
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e);
            System.err.println("exeção capturada:"+e.getMessage());
        } catch (ArithmeticException f) {
            System.err.println("exeção capturada:"+f.getMessage());
        } finally{
            System.err.println("Passou do Erro");
        }


    }
}
