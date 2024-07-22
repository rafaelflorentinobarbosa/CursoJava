public class Veiculo {
    private String marca;
    private String modelo; 
    private int anoFabricacao;
    private int anoModelo;
    private String motorizacao;
    private double capacidadeTanque;
    private String cor;
    private String placa; 
    private String renavam;

    public Veiculo(String marca, String modelo, int anoFabricacao, int anoModelo, String motorizacao,
        double capacidadeTanque, String cor, String placa, String renavam) {
        setMarca(marca);
        setModelo(modelo);
        setAnoFabricacao(anoFabricacao);
        setAnoModelo(anoModelo);
        setMotorizacao(motorizacao);
        setCapacidadeTanque(capacidadeTanque);
        setCor(cor);
        setPlaca(placa);
        setRenavam(renavam);
    }

    @Override
    public String toString() {
        return "Dados Veiculo [\nmarca = " + getMarca() + ", \nmodelo = " + getModelo() + ", \nanoFabricacao = " + getAnoFabricacao() + ", \nanoModelo = "
                + getAnoModelo() + ", \nmotorizacao = " + getMotorizacao() + ", \ncapacidadeTanque = " + getCapacidadeTanque() + ", \ncor = " + getCor()
                + ", \nplaca = " + getPlaca() + ", \nrenavam = " + getRenavam() + "]";
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    public String getMotorizacao() {
        return motorizacao;
    }
    public void setMotorizacao(String motorizacao) {
        this.motorizacao = motorizacao;
    }
    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }
    public void setCapacidadeTanque(double capacidadeTanque2) {
        this.capacidadeTanque = capacidadeTanque2;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getRenavam() {
        return renavam;
    }
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    } 

    
}
