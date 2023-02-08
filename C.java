public class C extends A{
    private int bonus;
    public C(int valor, int bonus){         //valor = herança de a
        super();
        this.bonus = bonus;
    }

    public int calcularValor(){
        return super.calcularValor() + bonus;
    }

    public static void main(String args[]){
        C objetoTipoC = new C(10, 50);
        System.out.println(objetoTipoC.calcularValor());
    }
}
