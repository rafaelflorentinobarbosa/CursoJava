package controle;

import java.text.SimpleDateFormat;
import java.util.Date;

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
    @SuppressWarnings("deprecation")
    public String validade(Date fabricacao){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");
       
        fabricacao.setDate(fabricacao.getDate() + 1);

        return fs.format(fabricacao);
    }
    

    // Sobrecarga de Metodo
    public double venda(int pacote){
        return pacote * 6.70;   
    }
    public double venda(double quilo){
        return quilo * 15.45;   
    }
}
