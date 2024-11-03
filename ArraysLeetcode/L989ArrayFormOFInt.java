import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class L989ArrayFormOFInt {
    public static void main(String[] args) {
        int[] num = {2,7,4};
        int k = 181;
        addToArrayForm(num,k);
        System.out.println();
    }
    static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList list = new ArrayList<>();
        for (int i = num.length-1; i >= 0 ; i--) {
            k = k + num[i];
            list.add(0,k%10);
            k = k/10;
        }
        return list;
    }
}
