package turistando.turistando.model;

public class AbastecimentoModel {

    private double valorAbastecido;
    private double quantidadeCombustivel;
    private double quilometragem;
    private String tipoCombustivel;
    private String placa;

    public double getValorAbastecido() {
        return valorAbastecido;
    }
    public void setValorAbastecido(double valorAbastecido) {
        this.valorAbastecido = valorAbastecido;
    }
    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }
    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
    public double getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    
}
