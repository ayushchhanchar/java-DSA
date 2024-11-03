public class countSquareSumTriplets {
//    leetcode1925
    public static void main(String[] args) {
        System.out.println(countTriples(5));
    }
    static public int countTriples(int n) {
        int count  = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int left = (i*i)+(j*j);
                for (int k = 1; k <= n; k++) {
                    if ((k*k) == left){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
