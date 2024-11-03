public class patternQ1 {
    public static void main(String[] args) {
//        traingle(4,0);
        reversetraingle(4,0);
    }
    static void traingle(int row,int col){
        if (row == 0) {
            return;
        }
        if (col < row){
            System.out.print(" *");
            traingle(row,col+1);
        }else{
            System.out.println();
            traingle(row-1,0);
        }
    }
    static void reversetraingle(int row,int col){
        if (row == 0) {
            return;
        }
        if (col < row){
            traingle(row,col+1);
            System.out.print(" *");
        }else{
            traingle(row-1,0);
            System.out.println();
        }
    }
}
