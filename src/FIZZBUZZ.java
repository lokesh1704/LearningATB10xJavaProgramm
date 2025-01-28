import java.util.Scanner;

public class FIZZBUZZ {
    public static void main(String[] args) {
        int i, a;
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ" + " " +i);
            } else if (i % 3 == 0) {
                System.out.println("FIZZ" +" "+i);
            } else if (i % 5 == 0) {
                System.out.println("BUZZ" +" "+i);
            }

        }
    }
}

