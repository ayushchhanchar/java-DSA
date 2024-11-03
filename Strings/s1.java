import java.util.Arrays;
import java.util.Scanner;

public class s1 {
//     Accept a string from user and print its each character on a new line
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String str = sc.nextLine();
    for (int i = 0; i < str.length(); i++) {
        System.out.println(str.charAt(i));
    }
}
}
