import java.util.Random;

public class Cwiczenie2 {
    public static void main(String[] args) {
        Random random = new Random();
        double vat = random.nextDouble();
        int nettoPrice = random.nextInt(100);

        System.out.println("Podatek: " + vat);
        System.out.println("Cena netto: " + nettoPrice);
        System.out.println("Cena brutto: " + (nettoPrice + (nettoPrice * vat)));

    }
}
