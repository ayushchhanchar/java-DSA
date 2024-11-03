import java.util.Arrays;

public class QuickSorting {
    public static void main(String[] args) {
        int[] arr = {4,5,3,6,2,1};
        QuickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void QuickSort(int[] arr,int low , int high){
        if ( low >= high){
            return;
        }

        int start = low;
        int end  = high;

        int mid = start + (end-start) /2 ;
        int pivot = arr[mid];

        while( start <= end ){
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }

            if (start <= end){
                swap(arr,arr[start],arr[end]);
                start++;
                end--;
            }
        }
//        now my pivot is correct index now move for other sub arrays
        QuickSort(arr,low,end);
        QuickSort(arr,start,high);
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
