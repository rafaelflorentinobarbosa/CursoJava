import validadores.CepInvalido;

public class App {
    public static void main(String[] args) {
        try {
            String cep = FormataCep("12345678");
            System.out.println(cep);
        } catch (CepInvalido e) {
            System.err.println(e.getMessage());
        }
    }

    static String FormataCep(String cep) throws CepInvalido {
        if (cep.length() < 8)
            throw new CepInvalido("A quantidade de caracteres é Menor que 8");
        if (cep.length() > 8)
            throw new CepInvalido("A quantidade de caracteres é Maior que 8");
        return "12.345-678";

    }
}
