public class special_using_method {
    public static int sod(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 129;
        while (n > 9) {
            n = sod(n);
        }
        System.out.println(n == 1 ? "special" : "not special");
    }


}
