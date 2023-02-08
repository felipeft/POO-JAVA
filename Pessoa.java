
public class Pessoa{                    //classe
    public String name;                 //atributo
    public int age;                     //atributo

    public void andar(){                //método
        System.out.println(name +" is walk");
    }
    public void apresentar(){
        System.out.println("ola, meu nome é " +name);
    }
    public static void main(String args[]) {
        Pessoa jose = new Pessoa();
        jose.name = "jose";
        jose.age = 14;

        Pessoa jao = new Pessoa();
        jao.name = "jao";
        jao.age = 37;

        jao.apresentar();
        jao.andar();


        
    }

    
}