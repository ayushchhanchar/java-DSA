public class array2 {
    public static void main(String[] args) {
//        Find the greatest element.
//        {2, 96, 69, 77, 145, 20} = Max element = 145 found at 4 index
        int[] arr = {2,45,67,34,145,20};
        int max = 0;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i]>arr[max]){
                arr[max] = arr[i];
            }

        }

        System.out.println("max element is "+ arr[max] + "at index" + max);

    }
}
