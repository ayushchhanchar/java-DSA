import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b =  sc.nextInt();

        int product= product(a,b);
        System.out.println("product is "+product);
    }
    static int product(int a,int b){
        return a*b;
    }
}
