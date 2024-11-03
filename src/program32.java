import java.util.Scanner;

public class program32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= a/2; i+=2) {
            int rem = a % i;
            if (rem == 0) {
                count++;
            }
        }
        System.out.println( count==1 ? "prime" : "Not prime");
    }
}
