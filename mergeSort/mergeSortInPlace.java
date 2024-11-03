import java.util.Arrays;

public class mergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {4,5,3,6,2,1};
        mergeSortingInplace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortingInplace(int[] arr,int start , int end){
        if (arr.length == 1){
            return;
        }
        int mid = end-start/2;

        mergeSortingInplace(arr,start,mid);
        mergeSortingInplace(arr,mid,end);

        mergeArrays(arr,start,mid,end);
    }

    private static void mergeArrays(int[] arr,int start,int mid ,int end) {
        int[] newArray = new int[arr.length];
        int i = start ;
        int j = mid;
        int k = 0;
        while(i < mid && j < end){
            if (arr[i] < arr[j]){
                newArray[k] = arr[i];
                i++;
            }else {
                newArray[k] = arr[i];
                j++;
            }
            k++;
        }

//        if length of one array is greater than another array and to add remaining elem in the ans array
        while(i < mid){
            newArray[k] = arr[i];
            i++;
            k++;
        }
        while(j < end){
            newArray[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < newArray.length; l++) {
            arr[start+l] = newArray[l];
        }
    }
}
