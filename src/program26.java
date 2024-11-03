import java.util.Scanner;

public class program26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no:");
        int a = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }
}
