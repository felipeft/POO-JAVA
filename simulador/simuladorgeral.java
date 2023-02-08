package simulador;
import simulador.carro.fusca; //com isso simulador geral enxerga classes que estao dentro de seu pacote

public class simuladorgeral {
    public static void main(String[] args){
        simulador.carro.fusca c1 = new simulador.carro.fusca(); //nesse caso nao precisariamos referenciar tudo ja que ja foi importado a classe carro la em cima
    }
}
