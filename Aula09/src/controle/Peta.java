package controle;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Peta extends Produto{
    private String sabor;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public void verificaValidade(LocalDate vencimento){
        LocalDate atual =  LocalDate.now();
        long diffEmDias = ChronoUnit.DAYS.between(vencimento, atual);

        if(vencimento.isAfter(atual)){
            System.out.println("Peta Dentro da validade");
            System.out.println("Falta: "+(diffEmDias*-1)+" dias para o Peta vencer.");
        }else if(atual.isAfter(vencimento)){
            System.out.println("Peta vencido");
            System.out.println("Há: "+(diffEmDias*-1)+" dias.");
        }
        else{
             System.out.println("Peta vence hoje.");
        }
    }

}
