package Polimorfismo;

public class Cavalo extends Animal{
    public void moverSe(int qtAndar){
        System.out.println("Cavalo galopando " + "de quatro patas  ");
        for(int i =  0; i<=qtAndar; i++ ){
            System.out.println("Galope "+i);
        }
    }
}
