import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Veiculo veiculo1 = new Veiculo();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o Tipo do Veiculo:");
        veiculo1.setNome(entrada.nextLine());
        System.out.println("Digite o modelo do Veiculo");
        veiculo1.setModelo(entrada.nextLine());
        System.out.println("Digite a potencia do Veiculo");
        veiculo1.setPotencia(entrada.nextDouble());
        System.out.println("Digite a quantidade de rodas do Veiculo");
        veiculo1.setQntPneus(entrada.nextInt());
        

        int opcao = -1;

        while(opcao != 0){
            System.out.println("\n ------- Digite a opçao desejada ---------\n\n 1 - Para ligar. \n 2 - Para acelerar \n 3 - Para frear. \n 4 - Para parar \n 5 - Para Desligar.\n 6 - Para Informacoes do veiculo.\n 0 - Para Sair do Menu. \n");
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    veiculo1.ligar();
                    break;
                case 2:
                    System.out.println("Digite quanto deseja acelerar(km): ");
                    int novaVelocidade = entrada.nextInt();
                    veiculo1.acelerar(novaVelocidade);
                    break;
                case 3:
                    System.out.println("Digite quanto deseja reduzir(km): ");
                    novaVelocidade = entrada.nextInt();
                    veiculo1.frear(novaVelocidade);
                    break;
                case 4:
                    veiculo1.parar();
                    break;
                case 5:
                    veiculo1.desligar();
                    break;
                case 6:
                    veiculo1.info();
                    break;
                default:
                    break;
            }
        }

        System.out.println("\nFim do programa 1.\n");
        System.out.println("\nInicio do programa 2.\n");

        System.out.println("Digite o Tipo do Veiculo:\n 1 - Moto\n 2 - Carro\n 3 - Caminhao\n");
        int tipo = entrada.nextInt();
        if(tipo == 1){
            Moto moto = new Moto();
            moto.setNome("Moto");
            moto.setModelo("Titan");
            moto.setQntPneus(2);
            moto.setStatus(false);
            moto.setVelocidade(0);
            moto.setCilindradas(200);
            moto.info();
        }else if(tipo == 2){
            Carro carro = new Carro();
            carro.setNome("Carro");
            carro.setModelo("Onix");
            carro.setPotencia(1.4);
            carro.setQntPneus(4);
            carro.setStatus(true);
            carro.setVelocidade(0);
            carro.info();
        }else if (tipo == 3) {
            Caminhao caminhao = new Caminhao();
            caminhao.setCarga(true);
            caminhao.setalavanca(true);
            caminhao.setQntPneus(6);
            caminhao.info();
            System.out.println("\n\n\nDescarregou? " + caminhao.descarregar(caminhao.isCarga(), caminhao.isalavanca()));
            
        }else{
            Veiculo veiculo = new Veiculo();
            veiculo.setNome(entrada.nextLine());
            veiculo.setModelo(entrada.nextLine());
            veiculo.setPotencia(entrada.nextDouble());
            veiculo.setQntPneus(entrada.nextInt());
            veiculo.info();
        }

        entrada.close();

    }
}
