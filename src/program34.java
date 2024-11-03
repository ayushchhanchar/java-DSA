import java.util.Scanner;
import java.lang.Math;

public class program34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        while(n !=0){
            c = n % 10;
            System.out.println(c);
            n = n / 10;
        }

    }
}
