public class Pattern1usingRec {
    public static void main(String[] args) {
        patt(5,0);
    }
    static void patt(int row ,int column){
        if (row == 0){
            return;
        }

        if (column < row){
            System.out.print("* ");
            patt(row,column+1);
        }else {
            System.out.println();
            patt(row-1,0);
        }
    }
}
