public class pattern13 {
//         *
//        * *
//       *   *
//      *     *
//     *********
public static void main(String[] args) {
    int n = 8;
    int m = n-3;
    pat1(n,m);
}
    static void pat1(int n,int m){
        for (int row = 1; row <= n; row++) {
            for (int i = 0; i < n-row; i++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
