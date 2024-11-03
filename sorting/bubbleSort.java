import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
//            for positing the max element in the end onr by one
            for (int j = 1; j < (arr.length-i); j++) {
                if (arr[j]<arr[j-1]){
                    int temp  = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
//          if there will be no swapping done int the array that means array is sorted alraedy and the loop will break after
            if (swapped == false){
                break;
            }
        }
    }
}
