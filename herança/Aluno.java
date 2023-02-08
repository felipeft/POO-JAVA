package herança;
import java.util.Date;

public class Aluno extends Pessoa{
    public Aluno(String _nome, String _cpf, Date _data){
        super(_nome, _cpf, _data);
    }
    public String matricula;

    public double precoRu(int qtd) { //Retorna o preço do Ru (pra aluno é marbarato)
		return 1.10 * (double) qtd;
	}
}


