import java.util.Arrays;

public class maxiNumber {
//     Maximum Number of Words Found in Sentences
public static void main(String[] args) {
    String str = "hello bhai kese ho";
    System.out.println("max number of words are: "+ count(str));
}
    static int count(String str){
        String[] str2 = str.split(" ");
        int count = str2.length;
        return count;
    }
}
