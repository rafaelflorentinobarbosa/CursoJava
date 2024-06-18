package controle;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pao extends Produto {
    private String tipoPao;

    public String getTipoPao() {
        return tipoPao;
    }

    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }

    //Sobrescrita de Metodo
    @Override
    public void verificaValidade(LocalDate vencimento){
        LocalDate atual =  LocalDate.now();
        long diffEmDias = ChronoUnit.DAYS.between(vencimento, atual);

        if(vencimento.isAfter(atual)){
            System.out.println("Pao Dentro da validade");
            System.out.println("Falta: "+(diffEmDias*-1)+" dias para o Pao vencer.");
        }else if(atual.isAfter(vencimento)){
            System.out.println("Pao vencido");
            System.out.println("Há: "+(diffEmDias*-1)+" dias.");
        }
        else{
             System.out.println("Pao vence hoje.");
        }
    }
    

    // Sobrecarga de Metodo
    public double venda(int pacote){
        return pacote * 6.70;   
    }
    public double venda(double quilo){
        return quilo * 15.45;   
    }
}
