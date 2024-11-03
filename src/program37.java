import java.util.Scanner;

public class program37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int rev=0;
        int rem;
        int copy = n;
        while (n != 0) {
            rem = n % 10;
            rev = rev*10 + rem;
            n = n / 10;

        }
        if (copy == rev){
            System.out.println("pall");
        }
        else {
            System.out.println("not");
        }


    }
}
