// my choice for print the combinations of changes

import java.util.*;

public class CoinChangeIII {

    static int size = 0;

    public static void main(String[] args) {
        
        int[] coins = new int[]{3,5,7,8,9,10,11};
        int amount = 500;

        helper(coins , coins.length , amount , new ArrayList<>());
        System.out.println(size);
    }

    private static void helper(int[] coins , int idx , int amt , List<Integer> comb){

        if(amt == 0){
            size++;
            System.out.println(comb);
            return;
        }

        if(idx == 0){
            return;
        }

        helper(coins , idx -1 , amt , comb);

        if(coins[idx -1] <= amt){
            comb.add(coins[idx-1]);
            helper(coins , idx , amt - coins[idx -1] , comb);
            comb.remove(comb.size()-1);
        }
    }
    
}
