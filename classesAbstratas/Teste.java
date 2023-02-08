package classesAbstratas;

public class Teste {
    public static void main(String[] args){ 
    Pessoa professor = new Professor("João", "Matemática");
    Pessoa aluno = new Aluno("Rafael", "124873223");

    Pessoa pessoa = new Pessoa("junin");    //pessoa é abstrata, n da pra instanciar assim
    //System.out.println("pessoa");

    System.out.println(professor);
    System.out.println(aluno);
    }
}
