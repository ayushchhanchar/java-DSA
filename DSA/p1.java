import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
//        Write a program to print whether a number is even or odd, also take input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the no." );
        int n = sc.nextInt();

        if (n%2 == 0 ){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
