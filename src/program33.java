import java.util.Scanner;
import java.lang.Math;

public class program33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        double a = sc.nextDouble();
        System.out.println("enter b:");
        double b = sc.nextDouble();

        double c = Math.pow(a,b);

        System.out.println(c);
    }

}
