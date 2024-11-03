//import java.util.Arrays;
//
//public class l4 {
////     search in 2D array
//public static void main(String[] args) {
//    int[][] arr =  {
//            {3,7,4,},
//            {67,9,3,24},
//            {78,32,3}
//    };
//    int target = 78;
//    int[] ans = {search(arr, target)};
//    System.out.println(Arrays.toString(ans));
//}
//static int[] search(int[][] arr, int target){
//    if (arr.length == 0){
//        return -1;
//    }
//    for (int i = 0; i < arr.length; i++) {
//        for (int j = 0; j < arr[i].length; j++) {
//            if (arr[i][j] == target){
//                return new int[]{i, j};
//            }
//        }
//        return new int[]{-1,-1};
//    };
//}
//}
