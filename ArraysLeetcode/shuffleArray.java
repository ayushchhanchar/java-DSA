import java.util.Arrays;

public class shuffleArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = nums.length/2;
        int[] ans = shuffle(nums,n);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];       // Place x_i
            result[2 * i + 1] = nums[i + n]; // Place y_i
        }

        return result;
    }
}
