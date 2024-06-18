package controle;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Produto {
    private String nome;
    private int quantidade;
    private double valor;
    private LocalDate dataFabricacao;
    private LocalDate dataValidade;

    
    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }
    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    public LocalDate getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    // Metodo verificaValidade com sobrecarga (3 possibiliades de entrada)

    public void verificaValidade(LocalDate vencimento){
        LocalDate atual =  LocalDate.now();
        long diffEmDias = ChronoUnit.DAYS.between(vencimento, atual);

        if(vencimento.isAfter(atual)){
            System.out.println("Produto Dentro da validade");
            System.out.println("Falta: "+(diffEmDias*-1)+" dias para o produto vencer.");
        }else if(atual.isAfter(vencimento)){
            System.out.println("Produto vencido");
            System.out.println("Há: "+(diffEmDias*-1)+" dias.");
        }
        else{
             System.out.println("Produto vence hoje.");
        }
    }

    public void verificaValidade(LocalDate vencimento, LocalDate atual){
        long diffEmDias = ChronoUnit.DAYS.between(vencimento, atual);

        if(vencimento.isAfter(atual)){
            System.out.println("Produto Dentro da validade");
            System.out.println("Falta: "+(diffEmDias*-1)+" dias para o produto vencer.");
        }else if(atual.isAfter(vencimento)){
            System.out.println("Produto vencido");
            System.out.println("Há: "+(diffEmDias*-1)+" dias.");
        }
        else{
             System.out.println("Produto vence hoje.");
        }
    }

    public void verificaValidade(LocalDate vencimento, LocalDate atual, LocalDate vencimentoAberto ){
        long diffEmDias = ChronoUnit.DAYS.between(vencimento, atual);

        if(vencimento.isAfter(atual)){
            System.out.println("Produto Dentro da validade");
            System.out.println("Falta: "+(diffEmDias*-1)+" dias para o produto vencer.");
        }else if(atual.isAfter(vencimento)){
            System.out.println("Produto vencido");
            System.out.println("Há: "+(diffEmDias*-1)+" dias.");
        }
        else{
             System.out.println("Produto vence hoje.");
        }
    }
}
