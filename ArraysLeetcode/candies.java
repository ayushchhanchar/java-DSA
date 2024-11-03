import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class candies {
//    kids with the greatest no of candies
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> ans = kidsWithCandies(candies,extraCandies);
        System.out.println(ans);

    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;
        for (int i = 1; i < candies.length; i++) {
            if ( candies[maxCandies] < candies[i]){
                maxCandies = i;
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxCandies ){
                result.add(true);
            }else {
                result.add(false);
            }
        }
     return result;
    }
}
