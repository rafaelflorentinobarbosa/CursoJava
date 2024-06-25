public class TabuadaArquivo {
    public static void main(String[] args) throws Exception {
        String caminhoTabuada = "tabuada.txt";

        // Tabuada no arquivo.txt e no terminal
        for (int i = 1; i <= 10; i++) {
            //System.out.println("\n Tabuada de "+i);
            ManipuladorArquivos.escritaTabuada(caminhoTabuada, " "); 
            ManipuladorArquivos.escritaTabuada(caminhoTabuada, "Tabuada de "+i); 

            for (int j = 1; j <= 10; j++) {
                //System.out.println(i+" x "+ j +" = "+ i*j);
                ManipuladorArquivos.escritaTabuada(caminhoTabuada, i+" x "+ j +" = "+ i*j);
            }  

        }  
        
        ManipuladorArquivos.leitura2(caminhoTabuada);
    }
}
