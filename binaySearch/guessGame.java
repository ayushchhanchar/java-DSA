import java.util.Scanner;

//leetcode : 374

public class guessGame {
    public static void main(String[] args) {
        int num = randomNumber();
        Scanner sc= new Scanner(System.in);

        System.out.println(guess(num));
    }
    static int guess(int num) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pick a no. from 1 to 10:");
        int pick = sc.nextInt();
        if (num > pick){
            return -1;
        } else if (num < pick) {
            return 1;
        } else if (num == pick) {
            return 0;
        }
        return 11;
    }
    static int randomNumber(){
        int min = 0;
        int max = 10;
        int random  = (int)(Math.random() * ((max - min)+1))+min;
        return random;
    }
}
