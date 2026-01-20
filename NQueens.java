// leetcode 51

// Time Complexity: O(n!)
// Space Complexity: O(n² + n)

// O(n!) comes from trying all possible queen placements row by row.
// O(n²) for storing the board configurations, O(n) for recursion stack.

import java.util.*;


public class NQueens {

    static int count =1;

    public static void main(String[] args) {

        int n = 4;

        boolean[][] mat = new boolean[n][n];

        List<List<String>> ans = new ArrayList<>();

        nQueens(mat , ans , 0);

        System.out.println(ans);

    }

    private static void nQueens(boolean[][] mat , List<List<String>> ans , int row){

        if(row == mat.length){
            generateList(ans, mat);
            return;
        }

        for(int col =0 ; col < mat.length;col++){

            if(isSafe(mat , row , col)){
                mat[row][col] = true;
                nQueens(mat, ans, row+1);
                mat[row][col] = false;
            }
        }
    }

    private static boolean isSafe(boolean[][] mat , int row , int col){

        for(int i=0;i<row;i++){

            if(mat[i][col]){
                return false;
            }
        }

        for(int i=row , j =col ;i>=0 && j>=0 ; i--,j--){
            if(mat[i][j]){
                return false;
            }
        }

        for(int i=row , j=col;i>=0 && j<mat.length;i--,j++){
            if(mat[i][j]){
                return false;
            }
        }

        return true;
    }

    private static void generateList(List<List<String>> ans , boolean[][] mat){

        List<String> temp = new ArrayList<>();


        for(int i=0;i<mat.length;i++){
        StringBuilder sb = new StringBuilder();

            for(int j=0;j<mat.length;j++){
                if(mat[i][j]){
                    sb.append("Q");
                }
                else{
                    sb.append(".");
                }
            }
        temp.add(sb.toString());

        }

        ans.add(temp); 

    }


}
