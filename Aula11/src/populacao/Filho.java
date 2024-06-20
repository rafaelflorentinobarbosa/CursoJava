package populacao;

public class Filho implements Pai, Mae {

    private String nome;
    private int idade;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public double altura(double altura) {
        return altura*Math.PI / 3;
    }

    @Override
    public boolean barba(boolean tem) {
        return tem;
    }

    @Override
    public boolean calvice(double alt) {

        if(alt > 1.5){
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public String corOlhos(String corOlhosPai, String corOlhosMae) {
        if (corOlhosPai == "Castanho" || corOlhosMae == "Castanho" ) {
            return "Castanho";
        }else if(corOlhosPai == "Azul" && corOlhosMae == "Azul" ){
            return "Verde";
        }else if(corOlhosPai == "Azul" && corOlhosMae == "Verde" ){
            return "Azul";
        }else if(corOlhosPai == "Verde" && corOlhosMae == "Verde" ){
            return "Azul";
        }else{
            return "Castanho";
        }
    }

    public String corOlhos2(String corA, String corB) {
        if(corA.equals(corB)){
            return corA;
        }else if(corA.equals("Castanho") && corB.equals("Azul")){
            return corA;
        }else if(corA.equals("Azul") && corB.equals("Verde")){
            return corB;
        }else{
            return corB;
        }   
    }

    @Override
    public String corPele(String corPelePai, String corPeleMae) {
        if (corPelePai == "Negro" && corPeleMae == "Negro" ) {
            return "Negro";
        }else if(corPelePai == "Branco" && corPeleMae == "Branco" ){
            return "Branco";
        }else if(corPelePai == "Amarelo" && corPeleMae == "Amarelo" ){
            return "Amarelo";
        }else if(corPelePai == "Negro" && corPeleMae == "Branco" ){
            return "Pardo";
        }else if(corPelePai == "Branco" && corPeleMae == "Negro" ){
            return "Pardo";
        }else if(corPelePai == "Branco" && corPeleMae == "Amarelo" ){
            return "Amarelo";
        }else if(corPelePai == "Amarelo" && corPeleMae == "Branco" ){
            return "Amarelo";
        }else if(corPelePai == "Branco" && corPeleMae == "Pardo" ){
            return "Pardo";
        }else if(corPelePai == "Pardo" && corPeleMae == "Branco" ){
            return "Pardo";
        }else if(corPelePai == "Pardo" && corPeleMae == "Negro" ){
            return "Negro";
        }else if(corPelePai == "Negro" && corPeleMae == "Pardo" ){
            return "Negro"; 
        }else if(corPelePai == "Negro" && corPeleMae == "Amarelo" ){
            return "Pardo";   
        }else if(corPelePai == "Amarelo" && corPeleMae == "Negro" ){
            return "Pardo";
        }else if(corPelePai == "Amarelo" && corPeleMae == "Pardo" ){
            return "Pardo";    
        }else if(corPelePai == "Pardo" && corPeleMae == "Amarelo" ){
            return "Pardo";            
        }else{
            return "Pardo";
        }
    }

    public String corPele2(String corPelePai, String corPeleMae) {
        if (corPelePai.equals("Negro") && corPeleMae.equals("Negro")) {
            return corPelePai;
        }else if(corPelePai.equals("Branco") && corPeleMae.equals("Branco")){
            return corPelePai;
        }else if(corPelePai.equals("Amarelo") && corPeleMae.equals("Amarelo") ){
            return corPelePai;
        }else if(corPelePai.equals("Negro") && corPeleMae.equals("Branco") ){
            return "Pardo";
        }else if(corPelePai.equals("Branco") && corPeleMae.equals("Negro") ){
            return "Pardo";
        }else if(corPelePai.equals("Branco") && corPeleMae.equals("Amarelo") ){
            return corPeleMae;
        }else if(corPelePai.equals("Amarelo") && corPeleMae.equals("Branco") ){
            return corPelePai;
        }else if(corPelePai.equals("Branco") && corPeleMae.equals("Pardo") ){
            return "Pardo";
        }else if(corPelePai.equals("Pardo") && corPeleMae.equals("Branco") ){
            return "Pardo";
        }else if(corPelePai.equals("Pardo") && corPeleMae.equals("Negro") ){
            return corPeleMae;
        }else if(corPelePai.equals("Negro") && corPeleMae.equals("Pardo") ){
            return corPelePai; 
        }else if(corPelePai.equals("Negro") && corPeleMae.equals("Amarelo") ){
            return "Pardo";   
        }else if(corPelePai.equals("Amarelo") && corPeleMae.equals("Negro") ){
            return "Pardo";
        }else if(corPelePai.equals("Amarelo") && corPeleMae.equals("Pardo") ){
            return "Pardo";    
        }else if(corPelePai.equals("Pardo") && corPeleMae.equals("Amarelo") ){
            return corPelePai;            
        }else{
            return corPelePai;
        }
    }


    @Override
    public String tipoCabelo(String tipoCabeloPai, String tipoCabeloMae) {

        if (tipoCabeloPai == "Cacheado" && tipoCabeloMae == "Cacheado" ) {
            return "Cacheado";
        }else if(tipoCabeloPai == "Cacheado" && tipoCabeloMae == "Liso" ){
            return "Cacheado";
        }else if(tipoCabeloPai == "Liso" && tipoCabeloMae == "Cacheado" ){
            return "Cacheado";
        }else if(tipoCabeloPai == "Liso" && tipoCabeloMae == "Liso" ){
            return "Liso";
        }else if(tipoCabeloPai == "Liso" && tipoCabeloMae == "Crespo" ){
            return "Cacheado";
        }else if(tipoCabeloPai == "Crespo" && tipoCabeloMae == "Liso" ){
            return "Cacheado";
        }else if(tipoCabeloPai == "Crespo" && tipoCabeloMae == "Crespo" ){
            return "Crespo";
        }else if(tipoCabeloPai == "Cacheado" && tipoCabeloMae == "Crespo" ){
            return "Crespo";
        }else if(tipoCabeloPai == "Crespo" && tipoCabeloMae == "Cacheado" ){
            return "Crespo";
        }else{
            return "Careca";
        }
    }

}
