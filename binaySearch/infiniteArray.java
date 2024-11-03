public class infiniteArray {
    //find position of element in a sorted array of infinite loop;
    public static void main(String[] args) {
        int[] arr = {2,4,5,5,11,23,33,54,67,69,77,97};
        int target = 33;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
//        firstly we'll find range in box size of 2;
        int start = 0;
        int end = 1;

//        now we're going to find range accordingly for condition by doubling the size of box of previous box
        while(target > arr[end]){
            int newStart = end +1;
//            for doubling the box size
            end = end + (end-start + 1)*2;
            start = newStart;
        }
        return search(arr,target,start,end);
    }
    static int search(int[] arr, int target ,int start,int end) {

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

        return -1;
    }

}
