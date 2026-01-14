// leetcode 18

import java.util.*;

public class FourSum {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1,0,-1,0,-2,2};
        int target = 0;

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);

        int n = arr.length;

        for(int i=0;i<n-3;i++){

            if(i > 0 && arr[i] == arr[i-1]){
                continue;
            }

            for(int j=i+1;j<n-2;j++){

                if(j>(i+1) && arr[j] == arr[j-1]){
                    continue;
                }

                int k = j+1 , l = n-1;

                while(k < l){

                    long sum = arr[i] +arr[j] + arr[k] + arr[l];

                    if(sum == target){
                        ans.add(Arrays.asList(arr[i] , arr[j] , arr[k] , arr[l]));

                        k++;
                        l--;

                        while(k < n && arr[k] == arr[k-1]){
                            k++;
                        }

                        while(l > 0 && arr[l] == arr[l+1]){
                            l--;
                        }
                    }
                    else if (sum < target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }

        System.out.println(ans);
    }
    
}
