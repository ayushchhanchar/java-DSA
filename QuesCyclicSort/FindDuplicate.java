public class FindDuplicate {
//    Leetcode287 find the duplicate number from range[1,n]
public static void main(String[] args) {

}
    public int findDuplicate(int[] nums){
        int i = 0;
        while(i < nums.length){
            if (nums[i] != i+1){
                int correct = nums[i] -1;
                if (nums[i] != nums[correct]){
                    swap(nums,i,correct);
                }else {
                    return nums[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }
    void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
