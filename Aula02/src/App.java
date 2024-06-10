public class App {
    public static void main(String[] args) throws Exception {
        
        /* Comentário 
        de Bloco */

        // Comentário de linha

        // System.out.println("Hello, World!");
        // int inteiro = 1;
        // double decimal = 1.0;
        // float f = 1.0f;
        // char unico = 'a';
        // String texto="texto longo";
        // boolean vf= false;
        // byte meuByte= 00110;
        // long numeroGrande= 999999999;

        int primeiro = 4;
        int segundo = 54;
        double terceiro = 45;
        double resultado;


        resultado = primeiro * (segundo + terceiro);
        System.out.println(resultado);

        resultado = primeiro / (segundo + terceiro);
        System.out.printf("%.4f\n",resultado);

        String nome= "Rafael";
        String sobrenome= "Florentino";

        System.out.print(nome+"\n");
        System.out.println(nome +" "+sobrenome);
        System.out.printf("%s Esse e o meu nome. \n", nome );

        int idade = 17;

        if(idade == 18){
            System.out.println("Voce tem 18 anos!");
        }
        else if(idade > 18){
            System.out.println("Voce tem mais que 18 anos!");
        }
        else{
            System.out.println("Voce é menor de idade!");
        }

        

        // Multiplique 2 números e verifique se o resultado e positivo ou negativo

        int num1 = -2;
        int num2 = 5;
        int resultado2 = 0;

        resultado2 = num1 * num2; // -10

        if (resultado2 == 0) {
            System.out.println("Número é zero");
        }else if (resultado2 > 0) {
            System.out.println("Número Positivo");
        }else{
            System.out.println("Número Negativo");
        }
    }
}
