import java.util.Scanner;

public class program36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int c = 0;
        int rev = 0;
        int rem;
        while (n != 0) {
            rem = n % 10;
            rev = rev*10 + rem;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
