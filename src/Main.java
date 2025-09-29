import java.util.ArrayList;
import java.util.HashSet;
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

        ArrayList<Integer> wylosowaneLiczby = wylosujLiczbyBezPowtorzenDoListy(30);
        wypisz(wylosowaneLiczby);
        HashSet<Integer>wylosowaneLiczbyZbior = wylosujLiczbyBezPowtorzenDoZbioru(20);
        wypisz(wylosowaneLiczbyZbior);
        }

        private static void wypisz(HashSet<Integer>zbior){
            System.out.println("Wypisane liczby ze zbioru: ");
            for (int liczba:zbior){
                System.out.println(liczba+", ");
            }
            System.out.println();
        }

        private static HashSet<Integer> wylosujLiczbyBezPowtorzenDoZbioru(int ileLiczb){
        //elemnty w zbiorze sie nie powtarzaja
            //elemnty sa nie indeksowane, nieuporzadkowane
            Random random = new Random();
            while (liczbyWylosowane.size()<ileLiczb){
                int liczba = random.nextInt(20);
                liczbyWylosowane.add(liczba)
            }
        }
 private static ArrayList<Integer>wylosujLiczbyBezPowtorzenDoListy(int ileLiczb){
        ArrayList<Integer> liczbyWylosowane = new ArrayList<>();
        //nie musi byc znany rozmiar listy, moze byc zmieniony w trakcie działania programu
        //w kazdej kolekcji tylko typy złozone
        //typ zlozony pisany wielka litera

        Random random = new Random();
     for (int i = 0; i <ileLiczb ; i++) {
         int liczba =random.nextInt(40)+1;
         while(liczbyWylosowane.contains(liczba)){
             liczba = random.nextInt(40)+1;
         }
         liczbyWylosowane.add(liczba);
     }

        return liczbyWylosowane;
 }
    private static void wypisz(int[] tablica){
        System.out.println("wylosowana Tablica: ");
        for (int i = 0; i < tablica.length ; i++) {
            System.out.println(tablica[i]+ ", ");

        }
    }

    private static void wypisz(ArrayList<Integer>lista){
        System.out.println("Wypisana lista: ");
        for (int i = 0; i < lista.size();i++){
            System.out.println(lista.get(i) + ", ");
        }
        System.out.println();
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