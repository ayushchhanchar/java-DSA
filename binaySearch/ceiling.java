public class ceiling {
//    ceiling of a number in an array
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14 ,16 ,18};
        int target = 15;

        System.out.println(ceiling(arr,target));
    }
    static int ceiling(int[] arr, int target){
        if (target  > arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;


        while(start <= end){
            int middle = start + (end-start)/2;

            if (target > arr[middle]) {
                start = middle + 1;
            }
            else if (target < arr[middle]) {
                end = middle -1;
            }else {
                return middle;
            }
        }

        return start;
    }
    }

