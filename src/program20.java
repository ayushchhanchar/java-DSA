import java.util.Scanner;

public class program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double am = 0.0;

        if (a >= 0 && a <= 5000) {
            am = (a / 100) * 0;
        } else if (a > 5000 && a <= 7000) {
            am = (a / 100) * 10;
        } else if (a > 7000 && a <= 10000) {
            am = (a / 100) * 20;
        } else if (a > 10000) {
            am = (a / 100) * 30;
        }
        System.out.println("amount will be " + (a - am));
    }

}
