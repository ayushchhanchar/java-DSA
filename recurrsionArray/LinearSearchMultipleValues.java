import java.util.ArrayList;

public class LinearSearchMultipleValues {
//    linear search for multiple occurences
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6};
//      System.out.println(Search(arr,5,0,list));
        System.out.println(Search2(arr,5,0));
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList Search(int[] arr,int target,int i,ArrayList<Integer> list){
        if (i == arr.length){
            return list;
        }

        if (arr[i] == target){
            list.add(i);
        }
        return Search(arr,target,i+1,list );

    }

//    printing List without Argument
    static ArrayList Search2(int[] arr,int target,int i){
        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length){
            return list;
        }

        if (arr[i] == target){
            list.add(i);
        }
        ArrayList<Integer> AddAnsBelow =  Search2(arr,target,i+1);
        list.addAll(AddAnsBelow);
        return list;

}

}
