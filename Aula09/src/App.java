import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import controle.Pao;
import controle.Produto;

public class App {
    public static void main(String[] args) throws Exception {


        @SuppressWarnings("deprecation")
        Date dataFabricacao = new Date(124, 0, 1, 12, 0, 0); 

        @SuppressWarnings("deprecation")
        Date dataValidade = new Date(124, 4, 15, 18, 30, 45); 

        @SuppressWarnings("deprecation")
        Date dataValidadeAberto = new Date(124, 4, 15, 18, 30, 45);
        
        
        Pao p1 = new Pao();
        System.out.println(p1.venda(2));
        System.out.println(p1.venda(5.5));

        Produto produto1 = new Produto();
        produto1.setNome("Leite");
        produto1.setQuantidade(1);
        produto1.setValor(6);

        Produto produto2 = new Produto();
        produto2.setNome("manteiga");
        produto2.setQuantidade(2);
        produto2.setValor(8);

        System.out.println(produto1.validade(dataFabricacao, dataValidade, dataValidadeAberto));
        System.out.println(produto2.validade(dataFabricacao, dataValidade));
        System.out.println(produto2.validade(dataFabricacao));
        
    }
}
// Crie 2 produtos que utilizem o metodo de validade com sobrescrita, sendo que o metodo recebera a data de fabricação, data de validade, data validade depois de aberto.
// na criação do metodo, utilizar sobrecrita e sobrecarga
