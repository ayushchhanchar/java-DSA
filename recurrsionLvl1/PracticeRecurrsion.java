public class PracticeRecurrsion {
    public static void main(String[] args) {
        System.out.println(SumOFDigits(3545));
    }
    static void fun(int  n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funRev(int  n){
        if (n == 0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
    static int SumNto1(int n){
        if (n <= 1){
            return 1 ;
        }
        return n + SumNto1(n-1);
    }
    static int ProductNto1(int n){
        if (n <= 1){
            return 1 ;
        }
        return n + ProductNto1(n-1);
    }
    static int SumOFDigits(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + SumOFDigits(n/10);
    }
}
