import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
//        Take 2 numbers as input and print the largest number.
        Scanner sc=  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
}
