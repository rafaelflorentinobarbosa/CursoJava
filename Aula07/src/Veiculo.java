public class Veiculo {
    private String nome;
    private String modelo;
    private Double potencia;
    private int qntPneus;
    private boolean status;
    private int velocidade;

    public void ligar(){
        setStatus(true);
        System.out.printf("\n%s ligado(a)\n",getNome());
    }
    public void desligar(){
        setStatus(false);
        System.out.printf("\n%s desligado(a)\n",getNome());
    }
    public void acelerar(int novaVelocidade){
        if(getStatus()== false){
            System.out.println("Ligue o carro primeiro");
        }else{
            velocidade += novaVelocidade;
            System.out.printf("\nAcelerando %s\n",getNome());
            System.out.printf("\nNova Velocidade %d\n",velocidade);
        }
    }
    public void frear(int novaVelocidade){
        if(getStatus()== false){
            System.out.println("Ligue o carro primeiro");
        }else{
            velocidade -= novaVelocidade;
            System.out.printf("\nFreando %s\n",getNome());
            System.out.printf("\nNova Velocidade %d\n",velocidade);
            if(getVelocidade() == 0){
                System.out.println("Carro Apagou.");
                setStatus(false);
            }
        }
    }
    public void parar(){
        if(getStatus()== false){
            System.out.println("Ligue o carro primeiro");
        }else{
            setVelocidade(0);
            System.out.printf("\nParando %s\n",getNome());
        }
    }
    public void info(){
        System.out.printf("\n-------Informacoes do Veiculo----------\n");
        System.out.printf("\n Nome: %s  ", getNome());
        System.out.printf("\n Modelo: %s ", getModelo());
        System.out.printf("\n Potencia: %.2f ", getPotencia());
        if(getStatus()){
            System.out.printf("\n Situacao: Ligado");
        }else{
            System.out.printf("\n Situacao: Desligado");
        }  
        System.out.printf("\n Velocidade Atual: %d  \n",getVelocidade()); 
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
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public int getQntPneus() {
        return qntPneus;
    }
    public void setQntPneus(int qntPneus) {
        this.qntPneus = qntPneus;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
}
