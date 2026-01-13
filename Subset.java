// leetcode 78

import java.util.*;

public class Subset {
    

    public static void main(String[] args) {
        
        int[] arr = new int[] {1,2,3};

        List<List<Integer>> ans = new ArrayList<>();

        generateSubSet(ans , new ArrayList<>() , arr , 0);

        System.out.println(ans);
    }

    private static void generateSubSet(List<List<Integer>> ans , List<Integer> temp , int[] arr , int start){

        ans.add(new ArrayList<>(temp));

        for(int i=start;i<arr.length;i++){

            temp.add(arr[i]);
            generateSubSet(ans , temp , arr , i+1);
            temp.remove(temp.size()-1);
        }
    }
}
