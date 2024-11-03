import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
//        Input currency in rupees and output in USD.
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        double dollar =(double) n*81.3;
        System.out.println(dollar);
    }
}
