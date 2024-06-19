package Figuras;

public class Quadrado implements Figura{
    private double lado = 0;

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String getNomeFigura(String nome){
        return nome;
    }
    
    public String getNomeFigura(){
        return "Quadrado";
    }

    @Override
    public double getArea(){
        return lado * lado;
    }

    @Override
    public double getPerimetro(){
        return lado * 4;
    }


}
