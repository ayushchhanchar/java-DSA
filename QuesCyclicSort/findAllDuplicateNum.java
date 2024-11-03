import java.util.ArrayList;
import java.util.List;

public class findAllDuplicateNum {
//    leetcode 442 find all duplicate numbers in range[1,n]
public static void main(String[] args) {

}
    public List<Integer> findDuplicates(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }
        void swap(int[] nums,int first,int second){
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }

}
