import java.util.Scanner;

public class task2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int i,j;
        for ( i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i);
            }
        }
        for (j = 1; j <= b; j++) {
            if (b % j == 0) {
                System.out.println(j);
            }
        }

        if (i == j ){
            System.out.println();
        }

    }
}
