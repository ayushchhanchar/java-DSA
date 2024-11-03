import java.util.Arrays;

public class bubbleSortR {
    public static void main(String[] args) {
        int[] arr = {4,5,3,1,2};
        bubbleR(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleR(int[] arr,int row ,int col){
        if (row == 0) {
            return;
        }
        if (col < row){
            if (arr[col] > arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubbleR(arr,row,col+1);
        }else{
            bubbleR(arr,row-1,0);
        }
    }

}
