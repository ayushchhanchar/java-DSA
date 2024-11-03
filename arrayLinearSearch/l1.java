public class l1 {
    public static void main(String[] args) {

        int[] arr = {3,6,54,87,2,7,94};
        int target = 87;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i ;
            }
        }
        return -1;
    }
}
