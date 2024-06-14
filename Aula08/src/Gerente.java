public class Gerente extends Funcionario {
    private Boolean usuario = false;
    private String departamento;

    public Boolean getUsuario() {
        return usuario;
    }
    public void setUsuario(Boolean usuario) {
        this.usuario = usuario;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void realizarReauniao(boolean realizou){
        if(realizou){
            System.out.println("\nRealizando reuniao.");
        }else{
            System.out.println("\nReuniao ja realizada.");
        }
       
    }
    
}
