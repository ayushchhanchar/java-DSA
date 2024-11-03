import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearchRec {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,2,2,78,89};
        MultipleSearch(arr,0,2);
        System.out.println(ans);
    }
    static int Search(int[] arr,int index ,int target){
        if (target == arr.length){
            return -1;
        }

        if (arr[index] == target){
            return index;
        }
        return Search(arr,index+1,target);
    }
    static ArrayList<Integer> ans = new ArrayList<>();
    static void MultipleSearch(int[] arr,int index ,int target){
        if (target == arr.length){
            return;
        }
        if (arr[index] == target){
            ans.add(index);
        }
        MultipleSearch(arr,index+1,target);
    }
}
