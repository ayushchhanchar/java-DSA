import java.util.Arrays;

public class split {
//    Accept a space seperated sentence and split in into words. Print each word on a new line with first letter capitalized.
//            IN-      Hello bhai kaise ho
//    OP-     Hello
//            Bhai
//            Kaise
//            Ho
public static void main(String[] args) {
    String str = "hello bhai kese ho";
    splitter(str);
}
static String[] splitter(String str){
    String[] str2 = str.split(" ");
    for (int i = 0; i < str2.length; i++) {
        String word = str2[i];
        char ch = Character.toUpperCase(word.charAt(0));
        String temp = word.substring(1);
        System.out.println(ch+temp);
    }
    return str2;
}
}
