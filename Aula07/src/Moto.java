public class Moto extends Veiculo{
    private int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void info() {
        System.out.printf("\n Informacoes da moto ");
        System.out.printf("\n Cilindradas: %s  ", getCilindradas());
        System.out.printf("\n Nome: %s  ", getNome());
        System.out.printf("\n Modelo: %s ", getModelo());

        if(getStatus()){
            System.out.printf("\n Situacao: Ligado");
        }else{
            System.out.printf("\n Situacao: Desligado");
        }  
        System.out.printf("\n Velocidade Atual: %d  \n",getVelocidade()); 
        
    }
}
