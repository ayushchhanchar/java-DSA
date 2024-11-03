public class SortingSentence {
//    Sort the words of the sentence
public static void main(String[] args) {
    String str = "is2 sentence4 this1 a3";
    sort(str);
}
static String[] sort(String str){
    String[] str2 = str.split(" ");
    System.out.println(str2[0].charAt(str2[0].length()));
    return str2;
}
}
