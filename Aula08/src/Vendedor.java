public class Vendedor extends Funcionario {
    private String matricula;
    private String setor;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String cetor) {
        this.setor = cetor;
    }
    
    public void venda(int qntItem, String nomeItem, double valorItem){
        
        System.out.println("\n----------- Venda ----------------\n");
        System.out.println("Produto: "+ nomeItem);
        System.out.println("Valor Unitario: "+ valorItem);
        System.out.println("Quantidade: "+ qntItem);
        System.out.println("Valor Total: "+ valorItem * qntItem);
        System.out.println("\n----------- Fim Venda ----------------");

    }
}
