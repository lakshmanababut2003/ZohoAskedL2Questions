// Leetcode 840
// Time Complexity: O(m · n)
// Space Complexity: O(1)

import java.util.*;

public class MagicSquares{

    public static void main(String[] args) {
        
        int[][] mat = new int[][]{
            {4,3,8,4} , {9,5,1,9} , {2,7,6,2} 
        };

        int c=0;

        for(int i=0;i<=mat.length-3;i++){
            for(int j=0;j<=mat[0].length-3;j++){
                if(isMagicSqr(mat, i, j)){
                    c++;
                }
            }
        }

        System.out.println(c);

    }

    private static boolean isMagicSqr(int[][] mat , int r , int c){

        int sum = mat[r][c] + mat[r][c+1]+mat[r][c+2];

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                int num = mat[r+i][c+j];

                if(num < 1 || num > 9 || set.contains(num)){
                    return false;
                }

                set.add(num);
            }
        }

        for(int i=0;i<3;i++){

            if(mat[r+i][c] + mat[r+i][c+1] + mat[r+i][c+2] != sum){
                return false;
            }

            if(mat[r][c+i] + mat[r+1][c+i] + mat[r+2][c+i] != sum){
                return false;
            }
        }

        if(mat[r][c] + mat[r+1][c+1] + mat[r+2][c+2] != sum){
            return false;
        }

        if(mat[r][c+2] + mat[r+1][c+1] + mat[r+2][c] != sum){
            return false;
        }

        return true;
    }


}