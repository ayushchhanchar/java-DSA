import java.util.Scanner;
public class task2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter starting point:");
        int s = sc.nextInt();
        System.out.println("enter ending point:");
        int e = sc.nextInt();

        for (int i = s;i <= e;i++){
            System.out.println(i);
        }
    }
}
