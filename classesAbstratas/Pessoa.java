package classesAbstratas;

public abstract class Pessoa {      //aqui nao coseguimos mais criar um objeto apartir dessa classe
    private String nome;
    public Pessoa(String nome){
        this.nome = nome;
    }
    public String toString(){
        return nome;
    }
}
