import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //losuj 10 liczb do tablicy

        int[] tablicaWylosowanychLiczb = new int[10];
        Random random = new Random();
        for (int i = 0; i < tablicaWylosowanychLiczb.length; i++) {
            tablicaWylosowanychLiczb[i] = random.nextInt(100)+1;//od 1 do 101
        }

        //Wypisz elemnty tablicy

        System.out.println("wylosowana tablica: ");
        for (int i = 0; i < tablicaWylosowanychLiczb.length ; i++) {
            System.out.println(tablicaWylosowanychLiczb[i]+ ", ");

        }



    }
}