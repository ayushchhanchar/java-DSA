import javax.print.event.PrintEvent;

public class program74 {

    public static boolean ispallindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= 0; j--) {
                if (s.charAt(i++) != s.charAt(j--)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(program74.ispallindrome("ayush"));
    }
}
