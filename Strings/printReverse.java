import java.util.Scanner;

public class printReverse {
//    Accept a string and print it in reverse order
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String str = sc.nextLine();
    reverse(str);
}
static void reverse(String str){
    String str2 ="";
    for (int i = str.length()-1; i >= 0; i--) {
        str2 += str.charAt(i);
    }
    System.out.println(str2);
}
}
