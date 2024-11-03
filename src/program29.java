import java.util.Scanner;

public class program29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no:");
        int n = sc.nextInt();
        int sumeven = 0;
        int sumodd = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sumeven = sumeven + i;
            } else {
                sumodd = sumodd + i;
            }

        }
        System.out.println("sum of even is " + sumeven);
        System.out.println("sum of odd is " + sumodd);
    }
}
