public class Despesa {
    private String nome;
    private float valor;
    private String placa;
    private String descricao;

    public Despesa(String nome, float valor, String placa, String descricao) {
        setNome(nome);
        setValor(valor);
        setPlaca(placa);
        setDescricao(descricao);
    }

    @Override
    public String toString() {
        return "Despesa [\nNome = " + getNome() + ",\nValor = " + getValor() + ",\nPlaca = " + getPlaca()
                + ",\nDescrição = " + getDescricao() + " ]";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}
