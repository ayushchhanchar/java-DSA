import java.lang.reflect.Array;
import java.util.Arrays;

public class L1365 {
//    How Many Numbers Are Smaller Than the Current Number
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    count++;
                    result[i] = count;
                }
            }
        }
        return result;
    }

}
