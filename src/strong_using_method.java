public class strong_using_method {
    public static int fact(int n) {
        int fact = 1;
        while (n-- != 0) {
            fact = fact * 1;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 129;
        int d = n;
        int sum =0;
        while (n!=0){
            int rem = n%10;
            sum+=fact(rem);
            n=n/10;
        }
        System.out.println(sum == d ? "strong":"not");
    }
}
