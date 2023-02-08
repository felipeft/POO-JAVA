package projetoteste.modelos;

public class aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public aluno(String nome, double n1, double n2){
        this.nome = nome;
        this.nota1 = n1;
        this.nota2 = n2;
    }
    
    public String getNome(){
        return nome;
    }

    public double getNota1(){
        return nota1;
    }

    public double getNota2(){
        return nota2;
    }
}
