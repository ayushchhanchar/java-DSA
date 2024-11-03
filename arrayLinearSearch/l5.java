public class l5 {
    public static void main(String[] args) {
//        how many numbers contain even number of digits in an array(leetcode:1295)
        int[] nums = {12,345,2,6,7896};


        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num = 0; num <= nums.length; num++) {
            if (even(num)){
                count++;
            }
        }
        return count;
    }

     static boolean even(int num) {
        int ans = numberOfDigits(num);
        if (ans % 2 == 0){
            return true;
        }
         return false;
     }
     static int numberOfDigits(int num){
        if (num < 0){
            return num = num*-1;
        }
        if (num==0){
            return 1;
        }

        int counts = 0;

        while(num > 0){
            counts++;
            num= num/10;
        }
        return counts;
     }
}
