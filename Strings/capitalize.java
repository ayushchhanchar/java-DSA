public class capitalize {
//    capitalize first & last character of each word in the sentence and print the new sentence
//      Ex - 	Hello bhai Kaise ho a
//	HellO BhaI KaisE HO A
public static void main(String[] args) {
    String str = "hello bhai kese ho";
    capital(str);
}
    static String[] capital(String str) {
        String[] str2 = str.split(" ");
        for (int i = 0; i < str2.length; i++) {
            String word = str2[i];
            char ch = Character.toUpperCase(word.charAt(0));
            char ch2 = Character.toUpperCase(word.charAt(word.length()-1));
            String temp = word.substring(1, word.length()-1);
            System.out.println(ch+temp+ch2);
        }
        return str2;
    }

}
