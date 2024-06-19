package Automovel;

public class Carro implements Veiculo, Proprietario{

    public String placa(String nome){
        return nome;
    }
    public void ligar(){
        System.out.println("Ligando Carro!");
    }

    public void desligar(){
        System.out.println("Desligando Carro!");
    }

    public void parar(){
        System.out.println("Desligando Carro!");
    }

    public double velocidadeMax(){
        return 0;
    }

    public String getNome(String nome){
        return nome;
    }

    public String getEndereco(){
        return "Taguatinga";
    }


}
