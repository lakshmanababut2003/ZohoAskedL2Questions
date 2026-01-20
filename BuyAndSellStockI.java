// leetcode 121
// time - o(n)
// space - o(1)

public class BuyAndSellStockI {

    public static void main(String[] args) {
        
        int[] arr = new int[]{7,6,4,3,1,8,10};

        int min=Integer.MAX_VALUE , profit =0;

        for(int i=0;i<arr.length;i++){

            if(min > arr[i]){
                min = arr[i];
            }

            profit = Math.max(profit, arr[i]-min);
        }

        System.out.println(profit);
    }
    
}
