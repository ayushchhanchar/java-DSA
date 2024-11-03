import java.util.Arrays;

public class MaxNoOfWordsL1935 {
    public static void main(String[] args) {
        String text = "hello world";
        String brokenLetters = "ld";
        System.out.println(canBeTypedWords(text,brokenLetters));
    }
    static public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;

        String[] arr = text.split(" ");
        String[] brokenArr = brokenLetters.split("");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                for (int k = 0; k < brokenArr.length; k++) {
                    String sub = arr[i].substring(j);
                    String subBroken = brokenArr[k].substring(k);
                    if (sub.equals(subBroken)){
                        count++;
                    }
                    subBroken = "";
                    sub="";
                }
            }
        }
        return count;
    }
}
