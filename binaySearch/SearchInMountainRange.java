public class SearchInMountainRange {
//    leetcode 1095
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,1};
        int target = 2;
        int  ans = search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firsttry = reverseBinarySearch(arr,target,0,peak);
        if (firsttry != 0){
            return firsttry;
        }
        return reverseBinarySearch(arr,target,peak+1,arr.length-1);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }

    static int reverseBinarySearch(int[] arr, int target ,int start, int end) {


        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int middle = start + (end-start)/2;

            if (arr[middle] == target ){
                return middle;
            }
            if (isAsc){
                if (target < arr[middle]){
                    end= middle-1;
                }else {
                    start = middle+1;
                }
            }else{
                if (target > arr[middle]){
                    end= middle-1;
                }else {
                    start = middle + 1;
                }
            }
        }

        return -1;
    }
}
