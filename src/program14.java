import java.util.Scanner;
public class program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the gender M/F:");
        char a = sc.nextLine().charAt(0);
        if (a == 'M' || a == 'm'){
            System.out.println("good morning sir");
        } else if (a == 'F' || a== 'f') {
            System.out.println("good morning madam");
        }
        else {
            System.out.println("wrong input");
        }
    }
}
