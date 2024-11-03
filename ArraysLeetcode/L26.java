import java.util.Arrays;

public class L26 {
//    remove duplicates from sorted array
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,3,4,4,4,4,6,6,7};
        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums) {
            int k = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[k] != nums[j]) {
                    k++;
                    nums[k] = nums[j];
                }
            }
            return k+1;
            
    }
}
