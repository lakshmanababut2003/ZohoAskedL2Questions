// leetcode  47(contains duplicate)

import java.util.*;

public class PermutationII {

    public static void main(String[] args) {

        int[] arr = new int[]{1,1,2};

        Set<List<Integer>> ans = new HashSet<>();

        generatePermute(arr , ans , 0);

        System.out.println(new ArrayList<>(ans));
        
    }

    private static void generatePermute(int[] arr , Set<List<Integer>> ans , int start){

        if(start == arr.length){

            List<Integer> temp = new ArrayList<>();

            for(int ele : arr){
                temp.add(ele);
            }

            ans.add(temp);
        }

        for(int i=start;i<arr.length;i++){
            swap(arr , start , i);
            generatePermute(arr, ans, start+1);
            swap(arr, start, i);
        }
    }

    private static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
