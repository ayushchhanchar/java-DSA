public class program73 {
    public static void main(String[] args) {
        String s = "naman";
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) {
            rev= rev + s.charAt(i);
        }
        System.out.println(s.equals(rev) ? "pallindrome" : " not pallindrome");
    }
}
