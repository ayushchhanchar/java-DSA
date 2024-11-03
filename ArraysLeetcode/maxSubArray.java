public class maxSubArray {
//    leetcode53
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum = currentSum+nums[i];
            if (currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

}
