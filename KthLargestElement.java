// leetcode 215

// time - o(n log k)
// space - o(k)


import java.util.*;

public class KthLargestElement {

    public static void main(String[] args) {

        int[] arr = new int[] {3,2,1,5,6,4};
        int k = 2;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int ele : arr){
            minHeap.add(ele);

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        System.out.println(minHeap.peek());
        
    }
    
}
