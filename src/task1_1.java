import java.util.Scanner;

public class task1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two nos:");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("addition of " + a + " and " + b + " is " + (a + b));
        System.out.println("subtraction of " + a + " and " + b + " is " + (a - b));
        System.out.println("multiplication of " + a + " and " + b + " is " + (a * b));
        System.out.println("division of " + a + " and " + b + " is " + (a / b));

    }
}
