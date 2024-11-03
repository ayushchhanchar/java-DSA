import java.lang.reflect.Array;
import java.util.Arrays;

public class L832 {
//    flipping an image
    public static void main(String[] args) {
        int[][] image={{1,1,0}, {1,0,1}, {0,0,0}};
        int[][] ans = flipAndInvertImage(image);
        for (int row = 0; row < image.length; row++) {
            for (int col = 0; col < image[row].length; col++) {
                System.out.println(ans);
            }
        }
    }
    static int[][] flipAndInvertImage(int[][] image){
        for (int row = 0; row < image.length; row++) {
            int start = 0;
            int end = image[0].length-1;
            while(start <= end){
                int temp = image[row][start];
                image[row][start] = image[row][end];
                image[row][end] = temp;
                start++;
                end--;
            }
        }
        for (int row = 0; row < image.length; row++) {
            for (int col = 0; col < image[row].length; col++) {
                image[row][col] = image[row][col]^1;
            }
        }
        return image;
        
    }


}
