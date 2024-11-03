import java.util.Scanner;
public class task1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year of birth");
        int birth = sc.nextInt();
        int curr = 2023;
        int age = curr - birth;
        System.out.println("age is "+ age);
    }
}
