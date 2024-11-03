import java.util.Scanner;
public class program43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);

        switch (ch){
            case 'a','A','e','E','i','I','o','O','u','U' -> System.out.println("vowel");
            default -> System.out.println("consonents");
        }

    }
}
