import java.util.Scanner;
public class program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the alphabet");
        char al = sc.nextLine().charAt(0);
        if (al == 'a' || al == 'e' || al == 'i' || al == 'o' || al == 'u'){
            System.out.println("vowel");
        }
        else {
            System.out.println("consonent");
        }
    }
}
