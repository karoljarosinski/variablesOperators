import java.util.Random;

public class Cwiczenie1 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(10);
        int y = random.nextInt(10);

        System.out.println(x);
        System.out.println(y);

        System.out.println("x > y?");
        System.out.println(x > y);
        System.out.println("x * 2 > y?");
        System.out.println((x*2) > y);
        System.out.println("y < (x+3) oraz y > (x-2)?");
        System.out.println(y < x+3 || y > x-2);
        System.out.println("x/y jest parzyste?");
        System.out.println(x%y == 0);
    }
}
