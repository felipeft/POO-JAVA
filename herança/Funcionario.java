package herança;
import java.util.Date;

public class Funcionario extends Pessoa {
    Funcionario(String _nome, String _cpf, Date _data){
        super(_nome, _cpf, _data);
    }
    public double salario;
    public Date _data_de_admissao;
    public String cargo;
    
}
