package Figuras;

public class Triangulo implements Figura{
    private double base = 0;
    private double altura = 0;
    private double ladoA = 0;
    private double ladoB = 0;
    private double ladoC = 0;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public String getNomeFigura(String nome){
        return nome;
    }

    public String getNomeFigura(){
        return "Triangulo";
    }
    @Override
    public double getArea(){
        return (base * altura)/2;
    }
    @Override
    public double getPerimetro(){
        return ladoA + ladoB + ladoC;
    }
}
