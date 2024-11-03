public class l3 {
//    linear search the max number in an array
public static void main(String[] args) {
    int[] arr = {3,6,54,87,2,7,94};
    int max = arr[0];

    System.out.println("max value at index no. "+maxValue(arr,max));
}
static int maxValue(int[] arr,int max ){
    if (arr.length == 0){
        return -1;
    }
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max){
            max = arr[i];
        }
        return max;
    }
    return -1;
}

}
