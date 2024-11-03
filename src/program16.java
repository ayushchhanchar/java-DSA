import java.util.Scanner;

public class program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("enter your name:");
        String name = sc.nextLine();
        if (age >= 18 ){
            System.out.println("hello "+ name +", you are elgible to vote;");
        }
        else {
            System.out.println("sorry you are not eligible to vote");
        }

    }
}
