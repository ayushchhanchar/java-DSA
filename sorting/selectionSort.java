import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
//       for this we'll find the last element and highest element in the array adn swap there positions
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max = maxElement(arr,0,last);
            swap(arr,max,last);
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int maxElement(int[] arr,int start,int last){
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[i] >=  arr[max]){
                max = i;
            }
        }
        return max;
    }
}
