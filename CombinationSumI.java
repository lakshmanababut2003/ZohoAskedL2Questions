// leetcode 39
// Time Complexity: O(2^t · k)
// Space Complexity: O(k)

// (where t = target / min(arr) and k = average combination length)

import java.util.*;

public class CombinationSumI {

    public static void main(String[] args) {
        
        int[] arr = new int[]{2,3,6,7};
        int target = 7;

        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, new ArrayList<>(), arr, target, 0);
        System.out.println(ans);
    }

    private static void helper(List<List<Integer>> ans , List<Integer> temp , int[] arr , int remain , int start){

        if(remain < 0){
            return ;
        }
        else if(remain == 0){
            ans.add(new ArrayList<>(temp));
        }
        else{

            for(int i=start;i<arr.length;i++){
                temp.add(arr[i]);
                helper(ans , temp , arr , remain-arr[i] , i);
                temp.remove(temp.size()-1);
            }
        }
    }
    
}
