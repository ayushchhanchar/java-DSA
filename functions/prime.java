import javax.swing.*;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=  sc.nextInt();

        boolean check = isPrime(n);
        if (check == true){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }

    }

     static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }
        else {
            for (int i = 2; i < n; i++) {
                if (n%i == 0 && n%i == 1){
                    return true;
                }
                else {
                    return false;
                }

        }
            return true;

        }


    }
}
