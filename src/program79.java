public class program79 {

    public static void main(String[] args) {
        String s = "hello bhai kese ho";
        String temp = "";
        String arr[] = s.split("");

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            char first = Character.toUpperCase(word.charAt(0));
            char last = Character.toUpperCase(word.charAt(word.length() - 1));
            String mid = word.substring(1, word.length() - 1);
            temp = temp + (first + mid + last);
        }
        System.out.println(temp);
    }
}
