public class l6 {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maxwealth(accounts));

    }
    static int maxwealth(int[][] accounts){
        int ans = 0;
        for (int person = 0; person < accounts.length; person++) {
            int banksum=0;
            for (int bank = 0; bank < accounts[person].length; bank++) {
                banksum = banksum + bank;
            }
            if (banksum > ans){
                ans = banksum;
            }
            return ans;

        }

    return -1;
    }
}
