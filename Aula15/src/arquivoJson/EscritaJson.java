package arquivoJson;
import org.json.*;
import org.json.simple.parser.*;
import org.json.simple.JSONObject;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("deprecation")
public class EscritaJson {
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException{
        
        JSONObject jsonObject = new JSONObject();
        JSONParser parser = new JSONParser();

        // Lendo um Arquivo Json

        String nome;
        String sobrenome;
        String cidade;
        String estado;

        try {
            jsonObject = (JSONObject) parser.parse(new FileReader("src\\arquivoJson\\saida.json"));
            nome = (String) jsonObject.get("Nome");
            sobrenome = (String) jsonObject.get("Sobrenome");
            cidade = (String) jsonObject.get("Cidade");
            estado = (String) jsonObject.get("Estado");

            System.out.println("O nome completo dele é: "+nome+" "+ sobrenome + " Nascido em: "+ cidade +" Estado: "+estado );
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        

    /* 
        // Escrevendo no Arquivo Json

        FileWriter escreve = null;

        jsonObject.put("Nome", "Damarcones");
        jsonObject.put("Sobrenome", "Porto");
        jsonObject.put("Cidade","Ceilandia");
        jsonObject.put("Estado","df");

        try {
            escreve = new FileWriter("src\\arquivoJson\\saida.json");
            escreve.write(jsonObject.toString());
            escreve.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(jsonObject);   
    */
    escreveJson();
    leJson();

    }

    public static void escreveJson(){       
        String nome = "Pessoa";
        String sobrenome = "Silva";
        String cidade = "Cidade";
        String estado = "Estado";

        FileWriter escreve = null;

        JSONArray pessoasArray = new JSONArray();

        for (int i = 1; i < 100; i++) {
            JSONObject pessoa = new JSONObject();

            pessoa.put("Nome", nome+i);
            pessoa.put("Sobrenome", sobrenome+i);
            pessoa.put("Cidade",cidade+i);
            pessoa.put("Estado",estado+i);

            pessoasArray.put(pessoa);

            try {
                escreve = new FileWriter("src\\arquivoJson\\saida2.json");
                escreve.write(pessoasArray.toString());
                escreve.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
    }
    public static void leJson(){   

        JSONObject jsonObject = new JSONObject();
        JSONParser parser = new JSONParser();

        // Lendo um Arquivo Json

        String nome;
        String sobrenome;
        String cidade;
        String estado;

        JSONArray jsonArray = new JSONArray();

        try {
            for (int i = 0; i < jsonArray.length(); i++) {

            jsonObject = (JSONObject) parser.parse(new FileReader("src\\arquivoJson\\saida2.json"));
            nome = (String) jsonObject.get("Nome");
            sobrenome = (String) jsonObject.get("Sobrenome");
            cidade = (String) jsonObject.get("Cidade");
            estado = (String) jsonObject.get("Estado");

            System.out.println("Nome: "+nome+" Sobrenome: "+ sobrenome + " Cidade: "+ cidade +" Estado: "+estado );
        }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }


    }
    
}
