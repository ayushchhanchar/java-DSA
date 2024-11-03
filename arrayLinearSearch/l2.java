public class l2 {
//    linear search the element in range
public static void main(String[] args) {
    int[] arr = {3,6,54,87,2,7,94};
    int target = 9;
    int ans = search(arr,target,2,7);
    System.out.println(ans);
}
static int search(int[] arr, int target ,int start , int end){
    if(arr.length ==0 ){
        return -1;
    }
    for (int i = start; i < end; i++) {
        if (arr[i] == target){
            return i;
        }
    }
    return -1;
}

}
