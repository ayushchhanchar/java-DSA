public class pattern8 {
//        *
//       ***
//      *****
//     *******
//    *********
public static void main(String[] args) {
    pat1(5);
}
    static void pat1(int n){
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
