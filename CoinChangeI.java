// leetcode 322
// Time complexity: O(S⋅n)
//  S is the number of coins and n is the target amount.
// Space complexity: O(n) - dp array

// Let's trace coins = [1, 2, 5], amount = 5:

// dp array of size 6, initialized to [0, 6, 6, 6, 6, 6]

// i = 1: Use coin 1. dp[1] = min(6, 1 + dp[0]) = 1. dp is [0, 1, 6, 6, 6, 6]

// i = 2: Use coin 1. dp[2] = min(6, 1 + dp[1]) = 2. Use coin 2. dp[2] = min(2, 1 + dp[0]) = 1. dp is [0, 1, 1, 6, 6, 6]

// i = 3: Use coin 1. dp[3] = min(6, 1 + dp[2]) = 2. Use coin 2. dp[3] = min(2, 1 + dp[1]) = 2. dp is [0, 1, 1, 2, 6, 6]

// i = 4: Use coin 1. dp[4] = min(6, 1 + dp[3]) = 3. Use coin 2. dp[4] = min(3, 1 + dp[2]) = 2. dp is [0, 1, 1, 2, 2, 6]

// i = 5: Use coin 1. dp[5] = min(6, 1 + dp[4]) = 3. Use coin 2. dp[5] = min(3, 1 + dp[3]) = 3. Use coin 5. dp[5] = min(3, 1 + dp[0]) = 1. dp is [0, 1, 1, 2, 2, 1]

// Final answer is dp[5], which is 1. 500 , 3,5,7,8,9,10,11

import java.util.*;

public class CoinChangeI {

    public static void main(String[] args) {
        
        int[] coins = new int[] {1,2,5};
        int amount = 11;

        int[] dp = new int[amount+1];
        Arrays.fill(dp , amount+1);

        dp[0]  = 0;

        for(int i=1;i<=amount;i++){

            for(int coin : coins){

                if(i-coin >= 0){

                    dp[i] = Math.min(dp[i] , 1+dp[i-coin]);
                }
            }
        }
        
        System.out.println(dp[amount] > amount ? -1 : dp[amount]);
    }
    
}
