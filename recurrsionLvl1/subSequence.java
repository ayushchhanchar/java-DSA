import java.util.ArrayList;

public class subSequence {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(subseqArray("", "abc",list));
    }


    static void subseq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0);

        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }
//    static ArrayList<String> subseqArray(String p, String up){
//        if (up.isEmpty()){
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//
//        char ch = up.charAt(0);
//
//        ArrayList<String> left = subseq(p+ch,up.substring(1));
//        ArrayList<String> right =  subseq(p,up.substring(1));
//
//        left.addAll(right);
//        return left;
//    }

    static ArrayList<String> subseqArray(String p, String up, ArrayList<String> list){
        if (up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

         subseqArray(p+ch,up.substring(1), list);
        subseqArray(p,up.substring(1), list);
        return list;
    }
}
