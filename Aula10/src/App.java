import Automovel.Carro;
import Automovel.Veiculo;
import Figuras.Circulo;
import Figuras.Quadrado;
import Figuras.Triangulo;

public class App {
 
    public static void LigarMotor(Veiculo veiculo){
        veiculo.ligar();
    }

    public static void main(String[] args) {
        Veiculo corsa = new Carro();
        App.LigarMotor(corsa);

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(14.7);
        System.out.print("\n\n"+quadrado.getNomeFigura("Quadrado Pequeno"));
        System.out.printf("\nArea: %.2f",quadrado.getArea());
        System.out.printf("\nPerimetro: %.2f",quadrado.getPerimetro());
        
        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(10);
        triangulo.setBase(10);
        triangulo.setLadoA(10);
        triangulo.setLadoB(10);
        triangulo.setLadoC(10);
        System.out.print("\n\n"+triangulo.getNomeFigura("Triangulo Isoceles"));
        System.out.printf("\nArea: %.2f",triangulo.getArea());
        System.out.printf("\nPerimetro: %.2f",triangulo.getPerimetro());

        Circulo circulo = new Circulo();
        circulo.setRaio(10.0);
        System.out.print("\n\n"+circulo.getNomeFigura());
        System.out.printf("\nArea: %.2f",circulo.getArea());
        System.out.printf("\nPerimetro: %.2f",circulo.getPerimetro());

        }
}
