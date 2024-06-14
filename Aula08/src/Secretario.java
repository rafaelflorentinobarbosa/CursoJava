import java.text.SimpleDateFormat;
import java.util.Date;

public class Secretario extends Funcionario {
    private long ramal;
    private String turno;

    public long getRamal() {
        return ramal;
    }
    public void setRamal(long ramal) {
        this.ramal = ramal;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void marcarReuniao(Date data, String nome){

        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");      
        String dataFormatada = fs.format(data);

        System.out.println("\n\n----------- Marcando Reuniao ----------------\n");
        System.out.println("Data: "+dataFormatada);
        System.out.println("Gerente: "+ nome);
        System.out.println("\n----------- Fim Marcacao ----------------\n");
    }
    

}
