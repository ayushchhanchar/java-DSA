public class program75 {
    public static void main(String[] args) {
        String s = "hellobhaikeseho";
        int vo = 0;
        int co = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' -> vo++;
                default -> co++;
            }
        }
        System.out.printf("consonents = %d and vowel = %d", co, vo);
    }
}
