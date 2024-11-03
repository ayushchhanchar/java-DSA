import java.util.ArrayList;
import java.util.List;

public class luckyNo {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};

    }
    static List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
//        for minimum
        for (int row = 0; row < matrix.length; row++) {
            int num = Integer.MAX_VALUE;
            int index = -1;
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] < num ){
                    num = matrix[row][col];
                    index = col;
                }
            }
//            max element in col
            int check = -1;
            for (int row2 = 0; row2 < matrix.length; row2++) {
                if (matrix[row2][index] > num){
                    check = 1;
                }
            }
            if (check == -1){
                list.add(num);
            }
        }
        return list;
    }

}
