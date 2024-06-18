import java.time.LocalDate;
import controle.Pao;
import controle.Peta;
import controle.Produto;

public class App {
    public static void main(String[] args) throws Exception {

        LocalDate fabricacao = LocalDate.of(2024, 6, 16);
        LocalDate vencimento = LocalDate.of(2024, 6, 22);
        LocalDate atual =  LocalDate.now();
        LocalDate vencimentoAberto = atual;

        Pao p1 = new Pao();
        System.out.println("Valor da venda: "+p1.venda(2));
        System.out.println("Valor da venda: "+p1.venda(5.5));
        System.out.println("\n");

        Produto pao = new Pao();
        pao.setNome("Pao Doce");
        pao.setQuantidade(1);
        pao.setValor(6);
        pao.setDataFabricacao(fabricacao);
        pao.setDataValidade(vencimento);
        pao.setQuantidade(10);
        pao.setValor(1.5);
        pao.verificaValidade(vencimentoAberto);
        System.out.println("\n");

        Produto peta = new Peta();
        peta.setNome("Peta Crocante");
        peta.setQuantidade(2);
        peta.setValor(8);
        peta.setDataFabricacao(fabricacao);
        peta.setDataValidade(vencimentoAberto);
        peta.verificaValidade(vencimentoAberto);
        System.out.println("\n");

        Produto produto3 = new Produto();
        produto3.setNome("Broa de Milho");
        produto3.setQuantidade(1);
        produto3.setValor(1.5);
        produto3.setDataFabricacao(fabricacao);
        produto3.setDataValidade(vencimento);       

        produto3.verificaValidade(vencimento, atual, vencimentoAberto);
        System.out.println("\n");
        produto3.verificaValidade(vencimento, atual);
        System.out.println("\n");
        produto3.verificaValidade(vencimento);
        
    }
}
// Crie 2 produtos que utilizem o metodo de validade com sobrescrita, sendo que o metodo recebera a data de fabricação, data de validade, data validade depois de aberto.
// na criação do metodo, utilizar sobrescrita e sobrecarga 
// metodo que verifica a validade, quanto dias até o produto vencer
