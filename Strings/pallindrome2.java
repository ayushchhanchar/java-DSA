public class pallindrome2 {
//    Pallindromic String using method and Two pointer algorithm (hint: Array reverse algo)
public static void main(String[] args) {
    String str = "abac";
    System.out.println(isPall(str));
}
    static boolean isPall(String str){
        char start = str.charAt(0);
        char end = str.charAt(str.length()-1);
        while(start < end){
            if (start != end){
                return false;
            }
        }
        return true;
    }
}
