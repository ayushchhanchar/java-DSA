public class b1 {
//    normal Binary search

    public static void main(String[] args) {
        int[] nums = {0, 5, 7, 35 ,89 , 112};
        int target = 35;
        int ans = Search(nums,target);
        System.out.println(ans);
    }

    static int Search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int middle = start + (end-start)/2;
            if (target > nums[middle]){
                start = middle + 1;
            } else if (target < nums[middle]) {
                end = middle -1;
            }else {
                return middle;
            }
        }
        return -1;
    }


}
