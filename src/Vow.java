import java.util.Scanner;

public class Vow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int i, j = 0,k=0;
        for (i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                j++;
            }
            else if(a.charAt(i)>='a' || a.charAt(i)<='z')
            {
                k++;
            }
        }
        System.out.println("vowels count"+" "+j);
        System.out.println("consonants count"+" "+k);
    }
}
