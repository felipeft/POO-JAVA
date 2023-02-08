package Polimorfismo;

public class SerHumano extends Animal {
    public void moverSe(int qtAndar){
       System.out.println("Ser Humano andando a pé ");

       for(int i =  0; i<=qtAndar; i++ ){
                  System.out.println("Passo "+i);
       }
    }
}