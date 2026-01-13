// leetcode 216

import java.util.*;

public class CombinationSumIII {

    public static void main(String[] args) {
        
        int n=9;
        int k =3;

        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans , new ArrayList<>() , arr , n , k , 0);
        System.out.println(ans);
    }

    private static void helper(List<List<Integer>> ans , List<Integer> temp , int[] arr , int remain , int k , int start){

        if(remain < 0){
            return;
        }
        else if(remain == 0 && temp.size() == k){
            ans.add(new ArrayList<>(temp));
        }
        else{
            for(int i= start;i<arr.length;i++){
                temp.add(arr[i]);
                helper(ans , temp , arr , remain-arr[i] , k , i+1);
                temp.remove(temp.size()-1);
             }
        }
    }
    
}
