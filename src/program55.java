public class program55 {
    public static void main(String[] args) {

        int[] arr = {2, 96, 69, 77, 145, 20};
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[m]) {
                m = i;
            }
        }
        System.out.println("max value at " + arr[m] + " index at " + m);
    }
}
