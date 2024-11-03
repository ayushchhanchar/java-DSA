import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        int firstTerm =0;
        int secondTerm = 1;
        int  next = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = next;

        int n = 10;
        for (int i = 1; i <= n; i++) {

            System.out.println(firstTerm + " ");

        }


    }
}
