import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
//        Take name as input and print a greeting message for that particular name.
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the name :");
        String name = sc.nextLine();
        System.out.println("hello "+ name);
    }
}
