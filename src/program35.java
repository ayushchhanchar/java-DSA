import java.util.Scanner;

public class program35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int c = 0;
        int sum = 0;
        while (n != 0) {
            c = n % 10;
            sum = sum + c;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
