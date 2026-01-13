// leetcode 40

import java.util.*;

public class CombinationSumII {
    
    public static void main(String[] args) {
        
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
        int target = 9;

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        helper(ans , new ArrayList<>() , arr  , target , 0);
        System.out.println(ans);
    }

    private static void helper(List<List<Integer>> ans , List<Integer> temp , int[] arr , int remain , int start){

        if(remain < 0){
            return;
        }
        else if(remain == 0){
            ans.add(new ArrayList<>(temp));
        }
        else{
            for(int i=start;i<arr.length;i++){
                if(i > start && arr[i] == arr[i-1]){
                    continue;
                }

                temp.add(arr[i]);
                helper(ans , temp , arr , remain-arr[i] , i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}
