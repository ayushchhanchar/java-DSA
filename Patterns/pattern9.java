public class pattern9 {
//    *********
//     *******
//      *****
//       ***
//        *
    public static void main(String[] args) {
        pat1(5);
    }
    static void pat1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" ");
            }
            for (int col = n-row+1; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}