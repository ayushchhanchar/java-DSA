import java.lang.reflect.Array;
import java.util.Arrays;

public class L867transposematrix {
    public static void main(String[] args) {
        int[][] matrix = { {1,2,3},
                {4,5,6},
                {7,8,9}};
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                System.out.println(transpose(matrix));
            }
        }

    }
    static int[][] transpose(int[][] matrix) {
        int[][] New = new int[matrix[0].length][matrix.length];
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                New[col][row] = matrix[row][col];
            }
        }
        return New;
    }
}
