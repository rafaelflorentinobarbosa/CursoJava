package escola.secretaria.Model;

import escola.secretaria.Enum.Turma;
import escola.secretaria.Enum.Turnos;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Alunos")
public class Aluno {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Matricula")
    @NotNull
    @Size(min = 3, max=50, message="A matricula deve conter entre 5 e 50 caracteres.")
    private Long matricula;

    @Column(name = "Nome")
    @Size(min = 3, max=50, message="O nome deve conter entre 3 e 50 caracteres.")
    @NotBlank(message = "O nome não pode ser vazio.")
    @NotNull
    private String nome;

    @Column(name = "Turno")
    @Enumerated(EnumType.STRING)
    @NotNull
    private Turnos turnos;

    @Column(name = "Turma")
    @Enumerated(EnumType.STRING)
    @NotNull
    private Turma turma;

    @Column(name = "Idade")
    @NotNull
    @NotBlank(message = "Forneça a idade")
    private int Idade;

    @Column(name = "Sexo")
    @NotNull
    @NotBlank(message= "Forneça o sexo")
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public Turnos getTurnos() {
        return turnos;
    }

    public void setTurnos(Turnos turnos) {
        this.turnos = turnos;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
}
