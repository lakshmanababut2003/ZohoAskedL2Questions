// leetcode 4

// time o((m+n) log (m+n))
// space o(1)

import java.util.*;

public class MedianOfTwoSortedArr {

    public static void main(String[] args) {
        
        int[] arr1 = new int[] {1,2};
        int[] arr2 = new int[] {3,4};

        int m = arr1.length;
        int n = arr2.length;

        int[] res = new int[m+n];

        for(int i=0 , j=0 ;i<(m+n);i++){
            if(i < m){
                res[i] = arr1[i];
            }
            else{
                res[i] = arr2[j++];
            }
        }

        Arrays.sort(res);
        int len = res.length;

        double median = 0.0;

        if(len % 2 == 0){
            median = (res[len/2] + res[(len/2)-1])/2.0;
        }
        else{
            median = res[len/2];
        }

        System.out.println(median);
    }
    
}
