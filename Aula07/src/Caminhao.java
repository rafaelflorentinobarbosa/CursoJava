public class Caminhao extends Veiculo {
    private boolean carga;
    private boolean alavanca;

    public boolean isCarga() {
        return carga;
    }
    public void setCarga(boolean carga) {
        this.carga = carga;
    }
    public boolean isalavanca() {
        return alavanca;
    }
    public void setalavanca(boolean alavanca) {
        this.alavanca = alavanca;
    }

    public boolean descarregar(boolean carga, boolean alavanca){
        if(carga == true && alavanca == true )
            return true;
        else
            return false;
    }

    @Override
    public void info() {
        System.out.printf("\n Informacoes do caminhao ");
        System.out.printf("\n Carga: %s  ", isCarga());
        System.out.printf("\n Alavanca: %s  ", isalavanca());
    }
}
