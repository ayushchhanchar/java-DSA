public class L1295EvenNumberOfDigits {
//    Given an array nums of integers, return how many of them contain an even number of digits.
    public static void main(String[] args) {
        int[] nums = {345,223,634,7896,53,87};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (iscount(nums[i])%2 == 0 ){
                count1++;
            }
        }
        return count1;
    }

        static int iscount(int i) {
        int count=0;
        while (i != 0) {
            i = i / 10;
            count++;
        }
        return count;
    }
}
