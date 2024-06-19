package Figuras;

public class Circulo implements Figura {

    public static final double PI = 3.14159;
    private Double raio = 0.0;
    
    public Double getRaio() {
        return raio;
    }
    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public String getNomeFigura(String nome){
        return "Circulo";
    }
    public String getNomeFigura(){
        return "Circulo";
    }
    @Override    
    public double getArea(){
        return PI * Math.pow(raio, 2);
    }
    @Override
    public double getPerimetro(){

        return 2 * Math.PI * raio;
    }
}
