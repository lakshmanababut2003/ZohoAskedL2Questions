// leetcode 56

import java.util.*;

public class MergedIntervals {

    public static void main(String[] args) {

        int[][] mat = new int[][] {
                { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 }
        };

       List<int[]> ans = new ArrayList<>();

       int n = mat.length;

       int[] start = new int[n];
       int[] end = new int[n];
       
       for(int i=0;i<n;i++){
        start[i] = mat[i][0];
        end[i] = mat[i][1];
       }

       Arrays.sort(start);
       Arrays.sort(end);

       int j=0;

       for(int i=0;i<n;i++){

        if(i == n-1 || start[i+1] > end[i]){
            ans.add(new int[] { start[j] , end[i]});
            j=i+1;
        }

       }

        for(int[] res : ans){
            System.out.println("[" + res[0] + " , " + res[1] + "]");
        }
    }

}
