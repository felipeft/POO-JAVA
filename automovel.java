public class automovel {
    private String nome;
    private String tipoCombustivel;
    private int qtdPassageiros;

    //construtores
    public automovel(String nome){
        this.nome = nome;
    }

    public automovel(String nome, String combustivel, int qtd){
        this.nome = nome;                                       //this eh para referenciar parametro da classe
        this.tipoCombustivel = combustivel;
        this.qtdPassageiros = qtd;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCombustivel(){
        return tipoCombustivel;
    }

    public void setCombustivel(String combustivel){
        this.tipoCombustivel = combustivel;
    }

    public int getQtd(){
        return qtdPassageiros;
    }

    public void setQtd(int qtd){
        this.qtdPassageiros = qtd;
    }

    public static void main(String[] args){

        //usando o primeiro construtor (diferença ta no tipo dos atributos)
        automovel carro1 = new automovel("lambo");
        carro1.setQtd(2);
        carro1.setCombustivel("hidrogenio");
        //veja que nesse construtor precisamos setar outros atributos a classe ja que o mesmo nao tem tudo na sua composição

        //segundo construtor
        automovel carro2 = new automovel("fiat marea", "oleo diesel", 13);

        System.out.println(carro1.getNome() +" usa " +carro1.getCombustivel() +" e transporta " +carro1.getQtd() +" passageiros");
        System.out.println(carro2.getNome() +" usa " +carro2.getCombustivel() +" e transporta " +carro2.getQtd() +" passageiros(vivos)");


    }
}
