public class anagram {
//    Check Two Strings are Anagram or Not
//        Anagrams words have the same word length & same character count
//        Examples of anagram words are arc and car, state and taste, night and thing etc.
public static void main(String[] args) {
    String str = "car";
    String str2 = "hee";
    System.out.println(Anagram(str,str2));
}
static boolean Anagram(String str,String str2){
    char[] ch = str.toCharArray();
    char[] ch2 = str2.toCharArray();
    for (int i = 0; i < ch.length; i++) {
        for (int j = 0; j < ch2.length; j++) {
            if (ch[i] == ch[j] && ch.length == ch2.length){
                return true;
            }
        }
    }
    return false;
}
}
