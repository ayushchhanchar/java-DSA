public class floor {
//    find floor od a no. in an array
public static void main(String[] args) {
    int[] arr = {2, 3, 5, 9, 14 ,16 , 18};
    int target = 15;
    int ans = floor(arr,target);
    System.out.println(ans);
}
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length;

        while(start <= end){
            int middle = start + (end-start)/2;
            if (target > arr[middle]){
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle -1;
            }else {
                return middle;
            }
        }

        return end;
    }
}
