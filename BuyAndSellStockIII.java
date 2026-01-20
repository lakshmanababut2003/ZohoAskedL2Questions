// leetcode 123
// time - o(n)
// space - o(1)

// First assume that we have no money, so buy1 means that we have to borrow money from others, we want to borrow less so that we have to make our balance as max as we can(because this is negative).

// sell1 means we decide to sell the stock, after selling it we have price[i] money and we have to give back the money we owed, so we have price[i] - |buy1| = prices[i ] + buy1, we want to make this max.

// buy2 means we want to buy another stock, we already have sell1 money, so after buying stock2 we have buy2 = sell1 - price[i] money left, we want more money left, so we make it max

// sell2 means we want to sell stock2, we can have price[i] money after selling it, and we have buy2 money left before, so sell2 = buy2 + prices[i], we make this max.

// So sell2 is the most money we can have.

public class BuyAndSellStockIII {

    public static void main(String[] args) {
        
        int[] arr = new int[] {3,3,5,0,0,3,1,4};

        int buy1 = -arr[0];
        int sell1 = 0;
        int buy2 = -arr[0];
        int sell2 =0;

        for(int i=1;i<arr.length;i++){

            int price = arr[i];

            buy1 = Math.max(buy1 , -price);
            sell1 = Math.max(sell1 , buy1+price);
            buy2 = Math.max(buy2 , sell1-price);
            sell2 = Math.max(sell2 , buy2+price);
        }

        System.out.println(sell2);
    }
    
}
