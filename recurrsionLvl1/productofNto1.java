public class productofNto1 {
    public static void main(String[] args) {
        System.out.println(product(5));
    }
    static int product(int n){
        if(n <= 1){
            return 1;
        }
        return n * product(n-1);

    }
}
