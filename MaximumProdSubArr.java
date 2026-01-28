// leetcode 152 

// time - o(n)
// space - o(1)

public class MaximumProdSubArr {

    public static void main(String[] args) {
        
        int[] arr = new int[] {2,3,-2,4};

        int left =1 , right = 1, maxProd = Integer.MIN_VALUE;

        for(int ele : arr){
            maxProd = Math.max(maxProd , ele);
        }

        for(int i=0;i<arr.length;i++){
            left*=arr[i];
            maxProd = Math.max(maxProd , left);
        }

        for(int i=arr.length-1;i>=0;i--){
            right*=arr[i];
            maxProd = Math.max(maxProd , right);
        }

        System.out.println(maxProd);
    }
    
}
