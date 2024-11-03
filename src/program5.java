import java.util.Scanner;
public class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter height of rectangle:");
        int h = sc.nextInt();
        System.out.println("enter width of rectangle:");
        int w = sc.nextInt();
        int perimeter = 2*(h+w);
        System.out.println("perimeter of rectangle is: "+ perimeter);
        int area = h*w;
        System.out.println("area of rectangle is " +area);
    }
}
