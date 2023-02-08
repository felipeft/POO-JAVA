package herança;
import java.util.Date;
//we are modeling a school in java...

public class Main {
    public static void main(String[] args) {
        Aluno p1 = new Aluno("holyfield", "157", new Date());
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + p1.nome);
		System.out.println("CPF: " + p1.cpf);
		System.out.println("Data de nascimento: " + p1.data_nascimento.toString());
        System.out.println(p1.precoRu(40));

        Professor p2 = new Professor("mike tyson", "420", new Date());
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + p2.nome);
		System.out.println("CPF: " + p2.cpf);
		System.out.println("Data de nascimento: " + p2.data_nascimento.toString());
        System.out.println(p2.precoRu(40));

        Funcionario p3 = new Funcionario("will smith", "404", new Date());
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + p3.nome);
		System.out.println("CPF: " + p3.cpf);
		System.out.println("Data de nascimento: " + p3.data_nascimento.toString());
        System.out.println(p2.precoRu(1));
    }
}
