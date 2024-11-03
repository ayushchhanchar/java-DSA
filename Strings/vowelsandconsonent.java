import java.io.PrintStream;

public class vowelsandconsonent {
//    Count vowels and consonents in a string
public static void main(String[] args) {
    String str = "abcdea";
    count(str);
}
static PrintStream count(String str){
    int vowelCount = 0;
    int conCount = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'a' ||str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u' ){
            vowelCount++;
        }else {
            conCount++;
        }
    }
    return System.out.printf("consonents = %d and vowel = %d", vowelCount, conCount);

}
}
