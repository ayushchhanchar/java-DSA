public class program76 {
    public static void main(String[] args) {

        String s = "aBcDeF";
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                temp = temp + Character.toLowerCase(ch);
            } else if (ch >= 'a' && ch <= 'z') {
                temp = temp + Character.toUpperCase(ch);
            }
        }
        System.out.println(temp);

    }
}
