package projetoteste.principal;
import projetoteste.modelos.aluno;

public class principal {

    public static double media(double val1, double val2){
        return (val1+val2) / 2;
    }
    public static void main(String[] args) {
        aluno a1 = new aluno("pedin", 10, 2.1);

        System.out.println(media(a1.getNota1(), a1.getNota2()));
    }

    
    
}
