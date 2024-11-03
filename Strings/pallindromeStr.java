public class pallindromeStr {
//    Check if the string is Pallindromic or not
public static void main(String[] args) {
    String str = "aba";
    System.out.println(isPall(str));
}
static boolean isPall(String str){
    String rev = "";
    for (int i = str.length()-1; i >= 0; i--) {
        rev = rev+ str.charAt(i);
    }
    if (rev.equals(str)){
        return true;
    }else {
        return false;
    }
}
}
