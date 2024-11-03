public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,2,78,89};
        System.out.println(sortR(arr,0));
    }
    static boolean sortR(int[] arr,int index){
        if (index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index+1] && sortR(arr,index+1);
    }

}
