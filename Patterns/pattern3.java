public class pattern3 {
//    *****
//    ****
//    ***
//    **
//    *
public static void main(String[] args) {
    pat3(5);
}
    static void pat3(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
