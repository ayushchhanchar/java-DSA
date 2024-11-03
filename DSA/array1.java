import java.util.Scanner;
import java.lang.Object;

public class array1 {
    public static void main(String[] args) {
//        Accept size n from user and create a n size array then take n inputs into the and finally
//        Print the sum & Avg of all elements.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) System.out.println(arr[i]+ " ");
    }
}
