import java.util.Scanner;
public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no.");
        int a = sc.nextInt();
        System.out.println("enter second no.");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum of two no "+ a + " and "+ b +" is "+ sum);
    }
}
