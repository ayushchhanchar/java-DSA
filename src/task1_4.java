import java.util.Scanner;

public class task1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();

        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("fizzbuzz");
        } else if (a % 3 == 0) {
            System.out.println("fizz");
        } else if (a % 5 == 0) {
            System.out.println("buzz");
        } else {
            System.out.println("none is true");
        }
    }
}
