import java.util.Scanner;
import java.lang.Math;
public class task1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of triangle:");
        double l = sc.nextDouble();
        System.out.println("enter width of triangle:");
        double w = sc.nextDouble();
        double h = ((l * l) + (w * w));
        System.out.println("hypotanos is " + Math.sqrt(h));
    }
}
