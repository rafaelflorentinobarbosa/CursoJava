package Automovel;

public interface Veiculo {
    public String placa(String nome);
    public double velocidadeMax();
    public void ligar();
    public void desligar();
    public void parar();

    // Não aceita public, pois método passa valor, necessário usar default
    default void buzinar(){
        System.out.println("Buzina");
    }
}
