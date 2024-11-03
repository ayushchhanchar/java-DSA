import java.util.Arrays;

public class heightChecker {
//    leetcode 1051
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
    public static int heightChecker(int[] heights) {
        int[] copy = heights.clone();
        int[] expected = new int[heights.length];
        bubble(heights);
        for (int k = 0; k < heights.length; k++) {
                 expected[k] = heights[k];
        };
        int i = 0;
        int j = 0;
        int count =0;
        while(i < copy.length && j < expected.length){
            if (copy[i] != expected[j]){
                count++;
                i++;
                j++;
            }
        }

        return count;
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
