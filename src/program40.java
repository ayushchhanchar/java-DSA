import java.util.Scanner;
public class program40 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        char ch;

        do {
            System.out.println("hello world");
            System.out.println("enter y to repaet");
            ch = sc.next().charAt(0);
        }
        while (ch == 'y' || ch == 'Y');
    }
}
