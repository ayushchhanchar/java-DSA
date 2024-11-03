public class twoSum{
//    leetcode:167
public static void main(String[] args) {
    int[] num = {2,7,11,15};
    int target = 9;
    System.out.println(twoSum(num,target));
}
static int[] twoSum(int[] num, int target){
    int start = 0;
    int end = num.length-1;
    while(start < end){
        int sum = num[start] + num[end];

        if (sum == target){
            return new int[]{start+1,end+1};
        } else{
            start++;
            end--;
        }

    }
    return new int[]{-1, -1};
}
}
