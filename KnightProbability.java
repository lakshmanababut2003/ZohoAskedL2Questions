// leetcode 688
// Time Complexity: O(n² · k)
// Space Complexity: O(n² · k)

import java.util.*;

public class KnightProbability {
    
    public static void main(String[] args){

        int n =3;
        int k=2;
        int row = 0 ;
        int col =0;

         int[][] directions = new int[][]{
        {2,1} , {2,-1},{-2,1},{-2,-1},{1,2},{-1,2},{1,-2},{-1,-2}
    };

    HashMap<String , Double> map = new HashMap<>();

    System.out.println(getProbablity(directions , n , k , row , col , map));

    }

    private static double getProbablity(int[][] d , int n , int k , int row , int col , HashMap<String , Double> map){

        if(row < 0 || col < 0 || row>=n || col>=n){
            return 0;
        }

        if(k == 0){
            return 1;
        }

        String key=k+"row"+row+"col"+col;

        if(map.containsKey(key)){
            return map.get(key);
        }

        double prob=0.0;

        for(int[] arr : d){

            int newRow = row+arr[0];
            int newCol = col+arr[1];

            prob+=getProbablity(d, n, k-1, newRow, newCol, map)/8.0;
        }

        map.put(key , prob);
        return prob;
    }
}
