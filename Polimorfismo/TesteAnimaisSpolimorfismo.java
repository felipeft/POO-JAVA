package Polimorfismo;

public class TesteAnimaisSpolimorfismo {
    public static void main(String[] args){ 
    // Instanciando um objeto a partir de uma classe
    Animal a1 = new Animal();

    //Instanciando objetos de subclasses para referência de superclasse
    Animal a2 = new SerHumano();
    Animal a3 = new Cavalo();
    Animal a4 = new Sapo();

    a1.moverSe(2);
    a2.moverSe(2);
    a3.moverSe(2);
    a4.moverSe(2);
    }
}
