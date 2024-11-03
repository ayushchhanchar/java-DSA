import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4} ;
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] runningSum(int[] nums) {
        int[] ans= new int[nums.length];
        ans[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
                ans[i] = nums[i] + ans[i-1];

    }
        return ans;
}
}