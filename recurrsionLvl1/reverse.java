public class reverse {
    public static void main(String[] args) {
        System.out.println(reverse(4321));
    }
    static int rev=0;
    static int reverse(int n){
        if (n ==0){
            return 0;
        }
        int rem = n%10;
        rev = rev*10 + rem;
        reverse(n/10);
        return rev;
    }

}
