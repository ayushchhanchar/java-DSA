import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
//        Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle:");
        int p = sc.nextInt();
        System.out.println("Enter time:");
        int t = sc.nextInt();
        System.out.println("Enter rate:");
        int r = sc.nextInt();

        double SI = (double) (p * r * t) /100;
        System.out.println(SI);
     }
}
