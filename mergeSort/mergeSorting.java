import java.util.Arrays;

public class mergeSorting {
    public static void main(String[] args) {
        int[] arr = {4,5,3,6,2,1};
        arr = merge(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] merge(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = merge(Arrays.copyOfRange(arr,0,mid));
        int[] right = merge(Arrays.copyOfRange(arr,mid,arr.length));

        return mergeArrays(left,right);
    }

    private static int[] mergeArrays(int[] left, int[] right) {
        int[] newArray = new int[left.length + right.length];
        int i= 0 ;
        int j = 0;
        int k = 0;
        while(i < left.length && j < right.length){
            if (left[i] < right[j]){
                newArray[k] = left[i];
                i++;
            }else {
                newArray[k] = right[i];
                j++;
            }
            k++;
        }

//        if length of one array is greater than another array and to add remaining elem in the ans array
        while(i < left.length){
            newArray[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            newArray[k] = right[j];
            j++;
            k++;
        }
        return newArray;
    }

}
