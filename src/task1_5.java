import java.util.Scanner;
public class task1_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no;");
        int a = sc.nextInt();

        if (a == 0){
            System.out.println("zero");
        } else if (a > 0 ) {
            System.out.println("positive");
        } else if (a < 0) {
            System.out.println("negative");
        }
    }
}
