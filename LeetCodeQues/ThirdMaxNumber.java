import java.util.Arrays;

public class ThirdMaxNumber {
    public static void main(String[] args) {
        int[] nums = {3,2,4,1};
        thirdmax(nums);
        System.out.println(nums[nums.length-3]);
    }
    public static int thirdmax(int[] nums) {
//       for this we'll find the last element and highest element in the array adn swap there positions
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length-i-1;
            int max = maxElement(nums,0,last);
            swap(nums,max,last);
        }
        return nums[nums.length-3];
    }
    static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    static int maxElement(int[] nums,int start,int last){
        int max = start;
        for (int i = start; i <= last; i++) {
            if (nums[i] >= nums[max]){
                max = i;
            }
        }
        return max;
    }

}
