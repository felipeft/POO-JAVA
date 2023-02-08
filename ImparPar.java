import java.util.Random;

public class ImparPar {
    public static void main(String args[]) {
        Random random = new Random();
        int i = random.nextInt(200) -  100;   //varia de -100 a 100
        System.out.printf("numero gerado aleatoriamente: " +i);
        System.out.printf("\n");
        if (i%2 == 0){
            if(i > 0){
                System.out.printf("o numero é par e positivo.\n");
            }
            else{
                System.out.printf("o numero é par e negativo.\n");
            }
        }
        else{
            if(i > 0){
                System.out.printf("o numero é ímpar e positivo.\n");
            }
            else{
                System.out.printf("o numero é ímpar e negativo.\n");
            }
        }
    }

}
