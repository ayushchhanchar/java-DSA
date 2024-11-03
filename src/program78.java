public class program78 {
    public static void main(String[] args) {
        String s = "hello bhai kese ho";

        String arr[] = s.split("");

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            char ch = Character.toUpperCase(word.charAt(0));
            String temp = word.substring(1);
            System.out.println(ch+temp);
        }

    }
}
