package herança;
import java.util.Date;


public class Pessoa {
	public String nome;
	public String cpf;
	public Date data_nascimento;

	public Pessoa(String _nome, String _cpf, Date _data) {
		this.nome = _nome;
		this.cpf = _cpf;
		this.data_nascimento = _data;
	}

	public double precoRu(int qtd) { //Retorna o preço do Ru
		return 7 * (double) qtd;
	}
}

//se colocassemos final double em precoRu, entao precoRu nao poderia ser reescrito em outras classes
