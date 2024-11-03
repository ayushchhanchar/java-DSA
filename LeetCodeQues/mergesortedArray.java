import java.util.Arrays;

public class mergesortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int  m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int r = nums1.length-1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[r] = nums1[i];
                i--;
            } else {
                nums1[r] = nums2[j];
                j--;
            }
            r--;
        }
    }
}
