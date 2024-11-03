import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L1389 {
//    Create Target Array in the Given Order
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();

        // Insert nums[i] at index[i] in the target array
        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }

        // Convert the target list to an array
        int[] result = new int[target.size()];
        for (int i = 0; i < target.size(); i++) {
            result[i] = target.get(i);
        }

        return result;
    }

}
