import java.util.Scanner;

public class program41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch ;
        System.out.println("welcome to cal \n1 -sum \n2- product");
        ch = sc.nextInt();
        do {

            if (ch == 1) {
                System.out.println("enter two no.:");
                int a = sc.nextInt();
                int b = sc.nextInt();

                System.out.println("sum is " + (a + b));
            } else if (ch == 2) {
                System.out.println("enter two no.:");
                int a = sc.nextInt();
                int b = sc.nextInt();

                System.out.println("sum is " + (a * b));
            } else {
                System.out.println("wrong input");
            }

        }
        while (ch == 1 || ch == 2);
    }
}
