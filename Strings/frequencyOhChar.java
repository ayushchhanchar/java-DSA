import java.util.Arrays;

public class frequencyOhChar {
//     Accept a string and print the frequency of each character present in the string
public static void main(String[] args) {
    String str = "hello bhaiii";
    counter(str);
}
static int counter(String str) {
    char[] str2 = str.toCharArray();

    for (int i = 0; i < str2.length; i++) {
        int count = 0;
        for (int j = i+1; j < str2.length; j++) {
            if (str2[i] == (str2[j]) ) {
                count++;
            }
        }
        System.out.println(str2[i] + " " + count);
    }

    return -1;
}
}
