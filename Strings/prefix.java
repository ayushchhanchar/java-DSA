import java.util.Arrays;

public class prefix {
//    Take an array of strings words and a String Prefix. Print the number of strings in words that contain pref as a prefix.
//       Example - Input: words = ["pay","attention","practice","attend"], pref = "at"
//                        Output: 2
public static void main(String[] args) {
    String[] str = {"attention","practice","attribute","as"};
    counter(str);
}
static void counter(String[] str){
    int count = 0;
    for (int i = 0; i < str.length; i++) {
        if (str[i].startsWith("at")) {
            count++;
        }
    }
    System.out.println(count);
}
}
