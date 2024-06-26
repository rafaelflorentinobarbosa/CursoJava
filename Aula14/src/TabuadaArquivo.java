public class TabuadaArquivo {
    public static void main(String[] args) throws Exception {
        String caminhoTabuada = "tabuada.txt";

        // Tabuada no arquivo tabuada.txt e no terminal
        for (int i = 1; i <= 10; i++) {
            ManipuladorArquivos.escritaTabuada(caminhoTabuada, " "); 
            ManipuladorArquivos.escritaTabuada(caminhoTabuada, "Tabuada de "+i); 

            for (int j = 1; j <= 10; j++) {
                ManipuladorArquivos.escritaTabuada(caminhoTabuada, i+" x "+ j +" = "+ i*j);
            }  

        }  
        
        ManipuladorArquivos.leituraTabuada(caminhoTabuada);
    }
}
