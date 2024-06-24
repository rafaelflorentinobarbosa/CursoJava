package validadores;

public class CepInvalido extends Exception {
    public CepInvalido(String mensagem){
        super(mensagem); // Chama método contrutor da classe pai Exception
    }

}
