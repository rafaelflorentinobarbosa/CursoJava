public class TabuadaInvertida {
    public static void main(String[] args) throws Exception{
        String caminhoTabuada = "tabuadaInvertida.txt";

        for (int i = 1, j = 100; j > 0; j--, i++) {
            ManipuladorArquivos.escritaTabuadaInvertida(caminhoTabuada, i+" x "+ j +" = "+ i*j);
        }  

        
    }
}
