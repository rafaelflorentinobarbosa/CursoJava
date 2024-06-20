import populacao.Filho;

public class App {
    public static void main(String[] args) throws Exception {
        
        Filho filho = new Filho();
        filho.setNome("Damarcones");
        filho.setIdade(29);

        System.out.println("Nome: "+filho.getNome());
        System.out.println("Idade: "+filho.getIdade());

        System.out.println("Altura: "+filho.altura(1.56));
        System.out.println("Tem barba: "+filho.barba(true));
        System.out.println("Calvice: "+filho.calvice(filho.altura(1.56)));
        System.out.println("Cor dos olhos: "+filho.corOlhos("Verde","Castanho"));
        System.out.println("Cor da pele: "+filho.corPele("Pardo","Negro"));
        System.out.println("Tipo cabelo: "+filho.tipoCabelo("Liso","Crespo"));

        System.out.println("\n\nCor dos olhos: "+filho.corOlhos2("Azul", "Verde"));
        System.out.println("Cor da pele: "+filho.corPele2("Amarelo","Branco"));

        
    }
}
