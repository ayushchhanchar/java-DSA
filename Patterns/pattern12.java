public class pattern12 {
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
    public static void main(String[] args) {
        pat1(5);
    }
    static void pat1(int n){
        for (int row = 1; row <= 2 * n; row++) {
            if (row > n){
                    for (int i = 1; i <= 2*n-row; i++) {
                        System.out.print(" ");
                    }
                    for (int col = 1; col <= row-n; col++) {
                        System.out.print("* ");
                    }
                    System.out.println();
            }else {
                    for (int i = 1; i < row; i++) {
                        System.out.print(" ");
                    }
                    for (int col = n-row+1; col >= 1; col--) {
                        System.out.print("* ");
                    }
                    System.out.println();
            }
        }
    }
}
