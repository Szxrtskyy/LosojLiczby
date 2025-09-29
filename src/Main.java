import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //losuj 10 liczb do tablicy

        int[] tablicaWylosowanychLiczb = new int[5];
        Random random = new Random();
        for (int i = 0; i < tablicaWylosowanychLiczb.length; i++) {
            tablicaWylosowanychLiczb[i] = random.nextInt(100)+1;//od 1 do 101
        }

        //Wypisz elemnty tablicy

        wypisz(tablicaWylosowanychLiczb);
        System.out.println();

        //losuj 30 liczb z zakresu 1,40 bez powtorzen



        }

    private static void wypisz(int[] tablica){
        for (int i = 0; i < tablica.length ; i++) {
            System.out.println(tablica[i]+ ", ");

        }
    }

    private static int[] losujLiczbyDoTablicy(int ileLiczb){
        int[] liczbyWylosowane = new int[ileLiczb];
        Random random = new Random();
        for (int i = 0; i < liczbyWylosowane.length; i++) {
           liczbyWylosowane[i] = random.nextInt(100) + 1;

        }
        return liczbyWylosowane;
    }
}