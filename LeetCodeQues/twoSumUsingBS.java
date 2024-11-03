import java.util.Arrays;

public class twoSumUsingBS {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 18;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length -1;
        int[] ans = new int[2];

        while(start < end){
            if (numbers[start] + numbers[end] < target){
                start++;
            } else if (numbers[start] + numbers[end] > target) {
                end--;
            }else if(numbers[start] + numbers[end] == target) {
                ans[0] = start;
                ans[1] = end;
                return ans;
            }
        }
        return new int[]{-1, -1};
    }
}
