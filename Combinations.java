// leetcode 77
// Time Complexity: O(C(n, k) · k)
// Space Complexity: O(k)

import java.util.*;

public class Combinations {

    public static void main(String[] args) {
        
        int n = 4 ;
        int k = 2;

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }

        List<List<Integer>> ans = new ArrayList<>();
        helper(ans , new ArrayList<>() , arr , k , 0 );

        System.out.println(ans);
    }

    private static void helper(List<List<Integer>> ans , List<Integer> temp , int[] arr , int k , int start){

        if(temp.size() == k){
            ans.add(new ArrayList<>(temp));
        }

        for(int i=start;i<arr.length;i++){
            temp.add(arr[i]);
            helper(ans , temp , arr , k , i+1);
            temp.remove(temp.size()-1);
        }
    }
    
}
