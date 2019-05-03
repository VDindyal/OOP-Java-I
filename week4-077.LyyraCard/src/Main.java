
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LyyraCard pekka = new LyyraCard(20);
        LyyraCard brian = new LyyraCard(30);

        pekka.payGourmet();
        System.out.println("Pekka: " + pekka);
        brian.payEconomical();
        System.out.println("Brian: " + brian);

        pekka.loadMoney(20);
        System.out.println("Pekka: " + pekka);
        brian.payGourmet();
        System.out.println("Brian: " + brian);

        pekka.payEconomical();
        pekka.payEconomical();
        System.out.println("Pekka: " + pekka);
        brian.loadMoney(50);
        System.out.println("Brian: " + brian);
    }
}
