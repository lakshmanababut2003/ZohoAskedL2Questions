// leetcode 1

// time - o(n)
// space - o(n)

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        
        int[] arr = new int[] {2,7,11,15};
        int target = 16;

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            int remain = target - arr[i];

            if(map.containsKey(remain)){
                System.out.println("[" + map.get(remain) + " , " + i + "]");
                return;
            }

            map.put(arr[i] , i);
        }

        System.out.println("[" + -1 + " , " + -1 + "]");
    }
    
}
