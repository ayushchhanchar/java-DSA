
import java.util.Arrays;

public class program61 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 4, 3};
//
        int i =0;
        int j= arr.length-1;
        while(i<j){
            int t  =arr[i];
            arr[i] = arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }

//     for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
//
//    }
}
