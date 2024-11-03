import java.util.Locale;

public class toggle {
//    Toggle each alphabet of String
//       In - AcgDfD Output - aCGdFd
public static void main(String[] args) {
    String str = "aBcDea";
    toggleStr(str);
}
static void toggleStr(String str){
    String str2 ="";
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch >= 'A' && ch <='Z' ){
            str2 += Character.toLowerCase(ch);
        } else if (ch >= 'a' && ch <='z') {
            str2 += Character.toUpperCase(ch);
        }
    }
    System.out.println(str2);
}
}
