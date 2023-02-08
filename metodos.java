import java.util.Scanner;

public class metodos{
    static Scanner ler = new Scanner(System.in);

    public static int soma(int x, int y){ //equivalente a uma função
        return x+y;
    }
    
    public static void main(String args[]) {
        int a, b;
        System.out.printf("Informe um valor: ");
        a = ler.nextInt();
        System.out.printf("Informe outro valor: ");
        b = ler.nextInt();
        System.out.println("a soma deles resulta em: " +soma(a,b));
    }
}
