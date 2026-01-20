// leetcode 46

// Time Complexity: O(n · n!)
// Space Complexity: O(n)

import java.util.*;

public class Permutataion {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1,2,3};

        List<List<Integer>> ans = new ArrayList<>();

        generatePermute(arr , ans , 0);

        System.out.println(ans);
    }

    private static void generatePermute(int[] arr , List<List<Integer>> ans , int start){

        if(start == arr.length){

            List<Integer> temp = new ArrayList<>();

            for(int ele : arr){
                temp.add(ele);
            }

            ans.add(temp);
        }

        for(int i=start;i<arr.length;i++){
            swap(arr , start , i);
            generatePermute(arr , ans , start+1);
            swap(arr , start , i);
        }
    }

    private static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
