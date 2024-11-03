import java.util.Scanner;
public class program27 {
    public static void main(String[] args) {
        System.out.println("enter the nos;");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = sc.nextInt();
        for (int i = 0 ; i < a ; i++){
            sum = sum + i;
            System.out.println(sum);
        }

    }
}
