import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();

        boolean check = isEvenOrOdd(n);
        if (check == true){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }

    private static boolean isEvenOrOdd(int n) {
        if(n %2 ==0){
            return true;
        }
        else {
            return false;

        }
    }
}
