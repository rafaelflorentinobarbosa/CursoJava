import Automovel.Carro;
import Automovel.Veiculo;

public class App {
 
    public static void LigarMotor(Veiculo veiculo){
        veiculo.ligar();
       
    }

    public static void main(String[] args) {
        Veiculo corsa = new Carro();

        App.LigarMotor(corsa);
    }
}
