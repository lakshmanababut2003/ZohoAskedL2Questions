// leetcode 3719

import java.util.*;

public class LongestBalancedSubArrI{
    

    public static void main(String[] args){

        int[] arr = new int[] {2,5,4,3};
        int n = arr.length;

        int ans = 0;

        for(int i=0;i<n;i++){

            HashSet<Integer> odd = new HashSet<>();
            HashSet<Integer> even = new HashSet<>();

            for(int j=i;j<n;j++){

                if(arr[j] % 2 == 0){
                    even.add(arr[j]);
                }
                else{
                    odd.add(arr[j]);
                }

                if(even.size() == odd.size()){
                    ans = Math.max(ans , j - i +1);
                }
            }

        }

            System.out.println(ans);


    }
    
}