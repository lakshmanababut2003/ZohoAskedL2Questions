// leetcode 122
// time - o(n)
// space - o(1)

public class BuyAndSellStockII {

    public static void main(String[] args) {
        
        int[] arr = new int[]{7,6,5,4,3};

        int profit = 0;

        for(int i=1;i<arr.length;i++){

            if(arr[i-1] < arr[i]){
                profit+= arr[i] - arr[i-1];
            }
        }

        System.out.println(profit);
    }
    
}
