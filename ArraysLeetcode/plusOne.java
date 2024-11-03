import java.lang.reflect.Array;
import java.util.Arrays;

public class plusOne {
//    leetcode66
    public static void main(String[] args) {
        int[] digits = {0};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i > 0 ; i--) {
            if (digits[i] < 9 ){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        if (digits.length == 1 && digits[0] < 1){
            digits[0] = 1;
            return digits;
        }else {
            digits = new int[digits.length+1];
            digits[0] = 1;
            return digits;
        }

    }
}
