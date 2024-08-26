package turistando.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "tb_abastecimento")
public class AbastecimentoModel implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @NotNull(message = "Valor abastecido não pode ser nulo")
    @Positive(message = "Valor abastecido deve ser positivo")
    private double valorAbastecido;

    @NotNull(message = "Quantidade de combustível não pode ser nula")
    @Positive(message = "Quantidade de combustível deve ser positiva")
    private double quantidadeCombustivel;

    @NotNull(message = "Quilometragem não pode ser nula")
    @Positive(message = "Quilometragem deve ser positiva")
    private double quilometragem;

    @NotNull(message = "Tipo de combustível não pode ser nulo")
    @Pattern(regexp = "Gasolina|Aalcool|Diesel|GNV", message = "Tipo de combustível inválido")
    private String tipoCombustivel;  

    @NotNull(message = "Placa não pode ser nula")
    @Pattern(regexp = "[A-Z0-9]+", message = "Placa deve conter apenas letras e números")
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
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    
}
