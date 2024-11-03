import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        sc.nextLine();
        String name = sc.nextLine();

        if (r >= 0.0 && r <= 2.0) {
            System.out.println(name + " is a flop");
        } else if (r >= 2.1 && r <= 3.4) {
            System.out.println(name + " is a semi hit");
        } else if (r >= 3.5 && r <= 4.5) {
            System.out.println(name + " is a hit");
        } else if (r >= 4.6 && r <= 5.0) {
            System.out.println(name + " is a super hit");
        }


    }
}
