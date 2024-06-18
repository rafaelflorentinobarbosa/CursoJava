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
        p1.setNome("Pao de sal");
        p1.setQuantidade(10);
        p1.setTipoPao("salgado");
        p1.setValor(1.5);
        p1.setDataFabricacao(fabricacao);
        p1.setDataValidade(vencimentoAberto);
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
        System.out.println("\n");
        
        // Crie um vetor de pão

        Pao p2 = new Pao();
        p2.setNome("Pao de doce");
        p2.setQuantidade(9);
        p2.setTipoPao("doce");
        p2.setValor(1.7);
        p2.setDataFabricacao(fabricacao);
        p2.setDataValidade(vencimentoAberto);

        Pao p3 = new Pao();
        p3.setNome("Pao palito");
        p3.setQuantidade(7);
        p3.setTipoPao("doce");
        p3.setValor(2.5);
        p3.setDataFabricacao(fabricacao);
        p3.setDataValidade(vencimentoAberto);

        Pao[] vetorPaes = new Pao[3];

        vetorPaes[0]=p1;
        vetorPaes[1]=p2; 
        vetorPaes[2]=p3; 

        System.out.println("------ Tipos de pão ------\n");

        for (int i = 0; i < vetorPaes.length; i++) {
            System.out.println( (i + 1) + " - " + vetorPaes[i].getNome());
        }

        System.out.println("\n------ Tipos de pão 2 ------\n");

        Pao[] paes = new Pao [3]; 
        paes[0] = new Pao("Frances");
        paes[1] = new Pao("Integral");
        paes[2] = new Pao("Pao de queijo");

        for (int i = 0; i < paes.length; i++) {
            System.out.println( (i + 1) + " - " + paes[i].getTipoPao());
        }

        // Outro tipo de for melhor
        System.out.println("\n \n");
        for(Pao i: paes){
            System.out.println(i.getTipoPao());
        }
 
    }
}
