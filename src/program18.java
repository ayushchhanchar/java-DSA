import java.util.Scanner;

public class program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three nums:");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is greater");
        } else if (b > a && b > c) {
            System.out.println(b + " is greater");
        } else if (c > a && c > b) {
            System.out.println(c + " is greater");
        }
    }
}
