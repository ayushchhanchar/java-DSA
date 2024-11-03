import java.util.Scanner;
public class program28 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int fact = 1;
        int a = sc.nextInt();
        for (int i = 1 ; i <= a; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
