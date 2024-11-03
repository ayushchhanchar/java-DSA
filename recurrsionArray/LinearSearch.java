public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Search(arr,4,0));;
    }
    static int Search(int[] arr,int target,int i){
        if (i == arr.length-1){
            return -1;
        }

        if (arr[i] == target){
            return i;
        }
        return Search(arr,target,i+1);

    }
}
