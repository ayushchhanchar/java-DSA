import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {
        System.out.println("enter the numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        if (a > b) {
            System.out.println("greater num is " + a);
        } else if (b > a) {
            System.out.println("greater num is " + b);
        }
    }
}
