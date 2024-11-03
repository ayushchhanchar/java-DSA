public class countSteps {
//    Given an integer num, return the number of steps to reduce it to zero.
//    In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    static int numberOfSteps(int num){
        return helper(num,0);
    }
    static int helper(int num,int steps){
        if(num == 0 ){
            return steps;
        }

        if (num%2 == 0){
            return helper(num/2,steps+1);
        }else {
            return helper(num-1,steps+1);
        }
    }

}
