package escola.secretaria.Model;

import escola.secretaria.Enum.Disciplinas;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Resultados")
public class Resultados {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id RES")
    private long idRes;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Matricula", referencedColumnName = "Matricula")
    private Aluno matricula;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id Disciplina", referencedColumnName = "Id Disciplina")
    private Disciplinas idDis;

    @Column(name = "PriNota")
    @NotBlank
    @NotNull
    private double priNota;

    @Column(name = "SegNota")
    @NotBlank
    @NotNull
    private double segNota;

    @Column(name = "TercNota")
    @NotBlank
    @NotNull
    private double tercNota;

    @Column(name = "TercNota")
    @NotBlank
    @NotNull
    private double quartNota;

    @Column(name = "Media")
    @NotBlank
    @NotNull
    private double media;

    public long getIdRes() {
        return idRes;
    }

    public void setIdRes(long idRes) {
        this.idRes = idRes;
    }

    public Aluno getMatricula() {
        return matricula;
    }

    public void setMatricula(Aluno matricula) {
        this.matricula = matricula;
    }

    public Disciplinas getIdDis() {
        return idDis;
    }

    public void setIdDis(Disciplinas idDis) {
        this.idDis = idDis;
    }

    

}
