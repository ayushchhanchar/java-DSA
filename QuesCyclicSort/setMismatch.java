public class setMismatch {
//    leetcode 645 find the missing number and the number occupied the space of that number
public static void main(String[] args) {

}
    public int[] findErrorNums(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if ( nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1){
                return new int[]{nums[index], index + 1};
            }
        }
        return new int[]{-1, -1};

    }
    void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
}
