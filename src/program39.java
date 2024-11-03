import java.lang.Math;
public class program39 {
    public static void main(String[] args) {
        int n= 25;
        int t =n;
        int sq = n*n;
        int c = 0;
        while (n!=0){
            c++;
            n = n/10;
        }
        int lastdigit = sq % (int)Math.pow(10,c);
        System.out.println(lastdigit == t? "auto":"not auto");
    }
}
