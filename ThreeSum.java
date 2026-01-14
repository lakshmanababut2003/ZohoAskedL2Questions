// leetcode 15

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        
        int[] arr = new int[] {-1,0,1,2,-1,-4};

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length && arr[i] <=0;i++){

            if(i==0 || arr[i] != arr[i-1]){
                twoSum(arr, i, ans);
            }
        }

        System.out.println(ans);

    }

    private static void twoSum(int[] arr , int i , List<List<Integer>> ans){

        int left = i+1;
        int right = arr.length-1;

        while(left < right){

            int sum = arr[left] + arr[right] + arr[i];

            if(sum < 0){
                left++;
            }
            else if(sum > 0){
                right--;
            }
            else{
                ans.add(Arrays.asList(arr[i] , arr[left++] , arr[right--]));
                while(left < right && arr[left] == arr[left-1]){
                    ++left;
                }
            }
        }
    }
    
}
