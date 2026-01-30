// leetcode 347

// time - o(n)
// space - o(n)

import java.util.*;

public class TopKFreqElements {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1,1,1,2,2,3};
        int k = 2;

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int ele : arr){
            map.put(ele , map.getOrDefault(ele , 0)+1);
        }

        Queue<Integer> heap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        for(int key : map.keySet()){
            heap.add(key);
        }

        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(heap.poll());
        }

        System.out.println(ans);
    }
    
}
