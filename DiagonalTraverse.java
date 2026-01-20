// Leetcode 498
// Time Complexity: O(m · n)
// Space Complexity: O(m · n)

import java.util.*;
public class DiagonalTraverse{

    public static void main(String[] args){

        int[][] mat = new int[][] {
            {1,2,3} , {4,5,6} , {7,8,9}
        };

        int col = 0;
        int row =0;

        int m = mat.length;
        int n = mat[0].length;

        int[] res = new int[m*n];

        for(int i=0;i<m*n;i++){

            res[i] = mat[row][col];

            if((row + col) % 2 == 0){

                if(col == n-1){
                    row++;
                }
                else if(row == 0){
                    col++;
                }
                else{
                    row--;
                    col++;
                }

            }
            else{

                if(row == m-1){
                    col++;
                }
                else if(col == 0){
                    row++;
                }
                else{
                    row++;
                    col--;
                }

            }
        }

        System.out.println(Arrays.toString(res));
    }
}