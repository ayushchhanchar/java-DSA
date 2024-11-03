public class ceiling2 {
//    find smallest letter greater than target  (Leetcode:744)
public static void main(String[] args) {
    char[] arr = {'a','c','f','j'};
    char target = 'c';

    System.out.println(nextGreatestLetter(arr,target));
}
    public static char nextGreatestLetter(char[] letters, char target){


        int start = 0;
        int end = letters.length-1;


        while(start <= end){
            int middle = start + (end-start)/2;

            if (target < letters[middle]) {
                end = middle - 1;
            }
            else  {
                start = middle +1;
            }
        }

        return  letters[start % letters.length];
    }
}
