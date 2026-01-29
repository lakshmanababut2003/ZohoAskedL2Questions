// leetcode 518
// Time complexity: O(S⋅n)
//  S is the number of coins and n is the target amount.
// Space complexity: O(s*n) - dp array

public class CoinChangeII {

    private static Integer[][] dp;
    public static void main(String[] args) {

        int[] coins = new int[]{1,2,5};
        int amount = 5;

        int n = coins.length;
        dp=new Integer[n+1][amount+1];
        System.out.println(helper(coins, n, amount));
        

    }


    private static int helper(int[] coins , int idx , int amt){

        if(amt == 0){
            return 1;
        }

        if(idx == 0){
            return 0;
        }

        if(dp[idx][amt] != null){
            return dp[idx][amt];
        }

        int skip = helper(coins , idx-1 , amt);

        int take =0;

        if(coins[idx -1] <= amt){
            take = helper(coins , idx , amt - coins[idx-1]);
        }

        return dp[idx][amt] = skip+take;
    }
    
}
