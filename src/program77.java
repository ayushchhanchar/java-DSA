public class program77 {
    public static void main(String[] args) {
        String[] s = {"attention","practice","attribute","as"};
        int c = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].startsWith("at")) {
                c++;
            }
        }
        System.out.println(c);
    }
}
