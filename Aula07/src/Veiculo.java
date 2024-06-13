public class Veiculo {
    private String nome;
    private String modelo;
    private int potencia;
    private int qntPeneus;

    public void ligar(){
        System.out.printf("\n%s ligado(a)",getNome());
    }
    public void desligar(){
        System.out.printf("\n%s desligado(a)",getNome());
    }
    public void acelerar(){
        System.out.printf("\nAcelerando %s",getNome());
    }
    public void frear(){
        System.out.printf("\nFreando %s",getNome());
    }
    public void parar(){
        System.out.printf("\nParando %s ",getNome());
    }
    public void info(){
        System.out.printf("\n nome: %s \nModelo: %s",getNome());
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public int getQntPeneus() {
        return qntPeneus;
    }
    public void setQntPeneus(int qntPeneus) {
        this.qntPeneus = qntPeneus;
    }
    
}
