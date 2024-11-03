import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int copy = n;
        int check = isPallindrome(n);
        if (check == n){
            System.out.println("pallindrome");
        }
        else {
            System.out.println("not");
        }
    }

    static int isPallindrome(int n) {
        int rev=0;

        while(n !=0){
            int rem = n%10;
            rev = (rev * 10) + rem;
            n=n/10;
        }
        return rev;
    }
    public boolean isPalindrome(int x) {
        int rev=0;
        int copy = x;
        while(x !=0){
            int rem = x%10;
            rev = (rev * 10) + rem;
            x=x/10;
        }
        if (rev == copy){
            return true;
        }
        return false;
    }
}
