package classesAbstratas;

public class Professor extends Pessoa { 
    private String disciplina;
    //private String[] turmas;
  
    public Professor(String nome, String disciplina){
      super(nome);                      //classe abstrata pessoa
      this.disciplina = disciplina;
    } 
    public String toString(){
        return super.toString() + " (Professor)" + "\n Disciplina: " + disciplina;
        
      }
  }
  