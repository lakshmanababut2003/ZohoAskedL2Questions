// Leetcode - 239

import java.util.*;

public class SlidingWindowMax {

    public static void main(String[] args) {

        int[] arr = new int[] {1,3,-1,-3,5,3,6,7};
        int k = 3;

        Deque<Integer> q = new ArrayDeque<>();
        int n = arr.length;
        int j =0;

        int[] res = new int[n-k+1];

        for(int i=0;i<n;i++){

            while(!q.isEmpty() && q.peekFirst() <= i-k){
                q.pollFirst();
            }

            while(!q.isEmpty() && arr[q.peekLast()] < arr[i]){
                q.pollLast();
            }

            q.addLast(i);

            if(i >= k-1){
                res[j++] = arr[q.peekFirst()];
            }
        }

        System.out.println(Arrays.toString(res));
        
    }
    
}
