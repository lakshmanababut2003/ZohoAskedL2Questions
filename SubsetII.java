// leetcode 

import java.util.*;

public class SubsetII {

    public static void main(String[] args) {
        
        int[] arr = new int[]{1,2,2};

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);
        generateSubSet(ans , new ArrayList<>() , arr , 0);

        System.out.println(ans);
    }
    

    private static void generateSubSet(List<List<Integer>> ans , List<Integer> temp , int[] arr  , int start){
        ans.add(new ArrayList<>(temp));

        for(int i=start;i<arr.length;i++){

            if(i > start && arr[i] == arr[i-1]){
                continue;
            }

            temp.add(arr[i]);
            generateSubSet(ans, temp, arr, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
