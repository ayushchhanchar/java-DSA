public class program62 {
    public static void main(String[] args) {
        int[] arr = {4, 16, 48, 34, 66};
        int se = 16;

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (se == arr[i]) {
                index = i;
                break;
            }
        }
        System.out.println(index == -1 ? "not found" : "found at " + index);
    }
}
