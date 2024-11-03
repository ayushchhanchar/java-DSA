import java.util.Arrays;

public class hello {
    public static void main(String[] args) {
        String str = "is2 sentence4 this1 a3";
        String[] str2 = str.split(" ");
        System.out.println(Arrays.toString(str2));
        System.out.println(Arrays.toString(new char[]{str2[0].charAt(str2[0].length())}));
    }
}
