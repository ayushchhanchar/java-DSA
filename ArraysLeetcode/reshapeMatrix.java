import java.util.ArrayList;

public class reshapeMatrix {
//    leetcode566
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r = 2;
        int c = 4;
    }
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat.length * mat[0].length){
            return mat;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int ans = mat[i][j];
                list.add(ans);
            }
        }
        int[][] result = new int[r][c];
        int check = 0;
        for (int k = 0; k < r; k++) {
            for (int l = 0; l < c; l++) {
                result[k][l] = list.get(check);
                check++;
            }
        }
        return result;
    }
}
