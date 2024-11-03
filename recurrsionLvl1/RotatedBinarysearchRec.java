public class RotatedBinarysearchRec {
    public static void main(String[] args) {
        int[] arr = {4,5,6,8,10,1,2,3};
        System.out.println(searchh(arr,2,0,arr.length-1));
    }
    static int searchh(int[] arr,int target,int start,int end){
        if (start > end){
            return -1;
        }
        int mid = start + (end-start)/2;

        if (target == arr[mid]){
            return mid;
        }

        if (arr[start] < arr[mid]){
            if (target >= arr[start] && target <= arr[mid] ){
                return searchh(arr,target,start,mid-1);
            }else {
                return searchh(arr,target,mid+1,end);
            }
        }
        if ( target >= arr[mid] && target <= arr[end] ){
            return searchh(arr,target,mid+1,end);
        }else{
            return searchh(arr,target,start,mid-1);
        }
    }
}
