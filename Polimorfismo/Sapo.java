package Polimorfismo;

public class Sapo extends Animal {
    public void moverSe(int qtAndar){
        System.out.println("Sapo pulando e agachando");
   
        for(int i =  0; i<=qtAndar; i++ ){
             System.out.println("Pulo "+i);
        }
    }
}
