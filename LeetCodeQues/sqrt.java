public class sqrt {
    public static void main(String[] args) {
        int x = 15;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        if (x == 0 ){
            return x;
        }

        int start = 1;
        int end= x;
        int mid  = start + (end - start)/2;

        while (start < end){
            if (mid*mid > x){
                end = mid-1;
            } else if (mid*mid < x){
                start = mid+1;
            } else if (mid*mid == x) {
                return mid;
            }
        }
        return -1;
    }
}
