// leetcode 300
// time - o(n log n)
// space -o(n)


import java.util.*;

public class LongestIncSubSeq {

    public static void main(String[] args) {
        
        int[] arr = new int[]{7,7,7,7,7,7,7};

        List<Integer> ans = new ArrayList<>();

        for(int ele : arr){

            if(ans.isEmpty() || ans.get(ans.size()-1) < ele){
                ans.add(ele);
            }
            else{

                int ind = binarySearch(ans , ele);
                ans.set(ind , ele);
            }
        }

        System.out.println(ans.size());
    }

    private static int binarySearch(List<Integer> ans , int target){

        int left =0 , right = ans.size()-1;

        while(left <= right){

            int mid = (left + right)/2;

            if(ans.get(mid) == target){
                return mid;
            }
            else if(ans.get(mid) < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

        return left;
    }
    
}
