import java.util.Scanner;
import java.lang.Math;

public class revision {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int coo = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[coo]){
                coo=i;
            }
        }
        System.out.println("greatest elemet is" + arr[coo]);
    }
}
