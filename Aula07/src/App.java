public class App {
    public static void main(String[] args) throws Exception {
        Veiculo veiculo1 = new Veiculo();

        veiculo1.setNome("Ferrari");
        veiculo1.setModelo("F8 SPIDER");
        veiculo1.setPotencia(720);
        veiculo1.setQntPeneus(4);

        veiculo1.ligar();
        veiculo1.acelerar();
        veiculo1.frear();
        veiculo1.parar();
        veiculo1.desligar();

    }
}
