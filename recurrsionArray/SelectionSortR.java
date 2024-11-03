import java.util.Arrays;

public class SelectionSortR {
    public static void main(String[] args) {
        int[] arr = {4,5,3,1,2};
        selectionR(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionR(int[] arr, int row , int col,int max){
        if (row == 0) {
            return;
        }
        if (col < row){
            if (arr[col] > arr[max]){
                selectionR(arr,row,col+1,col);
            }else {
                selectionR(arr,row,col+1,max);
            }
        }else{
            int temp = arr[row-1];
            arr[row-1] = arr[max];
            arr[max] = temp;
            selectionR(arr,row-1,0,0);
        }
    }
}
