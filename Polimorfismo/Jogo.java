package Polimorfismo;

public class Jogo{
    public static String cor;
    public static void main(String[] args){	
        Personagem heroi = new Personagem();
        
        Inimigo inimigos[ ] = new Inimigo[150];
        //Neste local os vetores de inimigos devem ser populados
        while(heroi.vivo()){
            int tipoInimigo = (int)(Math.random()*10)%3;
            inimigos[qualInimigo].atacar();

            if(inimigos[qualInimigo] instanceof Cobra){     //instanceof é um booleano
                corJogo(“Verde”);
            }
        }
        public static void corJogo(String novaCor){
            cor = novaCor;
        }
    }
}