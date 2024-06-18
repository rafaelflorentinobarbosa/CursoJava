import java.util.ArrayList;
import java.util.List;

import controle.Pao;

public class FabricaPao {
    public static void main(String[] args) {

        Pao[] paes = new Pao [4]; 
        paes[0] = new Pao("Cateira");
        paes[1] = new Pao("Baguete");
        paes[2] = new Pao("Sonho");
        paes[3] = new Pao("Pao de queijo");

        List <Pao> padaria = new ArrayList<Pao>();

        padaria.add(paes[0]);
        padaria.add(paes[1]);
        padaria.add(paes[2]);
        padaria.add(paes[3]);

        padaria.remove(paes[3]);
        
        System.out.println("\n Lista de Paes \n");
        for(Pao pao: padaria){
            System.out.println(pao.getTipoPao());
        }
    }
}
