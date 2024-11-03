import java.util.Scanner;

public class kaka {
//    How to Find the Largest and Smallest of Three Numbers
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int a = sc.nextInt();
        int b =  sc.nextInt();
        int c = sc.nextInt();

        int largest = largest(a,b,c);
        int smallest = smallest(a,b,c);
        System.out.println("largest no. is " +largest);
        System.out.println("smallest no. is " +smallest);

    }
    static int largest(int a, int b, int c) {
        int max = a;

        if (b > max){
            max = b;
        } else if (c > max) {
            max = c;
        }

        return max;
    }
    static int smallest(int a, int b, int c) {
        int min = a;

        if (b < min){
            min = b;
        } else if (c < min) {
            min = c;
        }

        return min;
    }


}
