public class Matriz {
    public static void main(String[] args) {

    // Matriz de Inteiros
    int i, j;
    int tamanho = 10;
    int matriz[][] = new int[tamanho][tamanho];
    //int i,j;

    // Alimentando a Matriz
    for(i = 0; i< tamanho; i++){
        for ( j = 0; j < matriz.length; j++) {
            matriz[i][j] = i * j;
        }
    }

    // Listar Matriz
    for(i = 0; i< tamanho; i++){
        for ( j = 0; j < matriz.length; j++) {
            System.out.print( matriz[i][j] + " ");
        }
        System.out.println();
    }
    

    // Mista
    for(i = 0; i< tamanho; i++){
        for ( j = 0; j < matriz.length; j++) {
            matriz[i][j] = i * j;
            System.out.print( matriz[i][j] + " ");
        }
        System.out.println();
    }

    }
}
