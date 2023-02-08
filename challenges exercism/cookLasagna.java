public class cookLasagna {

    public int expectedMinutesInOven(){
        return 40;
    }

    public void remainingMinutesInOven(int m){
        System.out.println(expectedMinutesInOven() - m +" minutes left");
    }

    public int preparationTimeInMinutes(int l){
        return l * 2;             //each layer of lasagna takes 2 minutes to prepare
    }

    public int totalTimeInMinutes(int layers, int minutesOven){
        return preparationTimeInMinutes(layers) +minutesOven;
    }

    public static void main(String args[]){
        cookLasagna chickenLasagna = new cookLasagna();
        System.out.println(chickenLasagna.expectedMinutesInOven() +" minutes are expected to cook");
        chickenLasagna.remainingMinutesInOven(30);
        System.out.println(chickenLasagna.preparationTimeInMinutes(6) +" minutes to prepare");
        System.out.println(chickenLasagna.totalTimeInMinutes(6, 20) +" total time to cook your lasagna");
    }
}
