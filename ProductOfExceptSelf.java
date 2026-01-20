// leetcode 238

// time -O(n)
// space -o(1) excluing result array

import java.util.*;

public class ProductOfExceptSelf {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1,2,3,4};

        int left =1 , right =1 , n=arr.length;

        int[] res = new int[n];

        Arrays.fill(res , 1);

        for(int i=0;i<n;i++){
            res[i]*=left;
            left*=arr[i];
        }

        System.out.println(Arrays.toString(res));

        for(int i=n-1;i>=0;i--){
            res[i]*=right;
            right*=arr[i];
        }

        System.out.println(Arrays.toString(res));
    }
    
}
