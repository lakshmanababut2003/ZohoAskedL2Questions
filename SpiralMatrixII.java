// leetcode 59

import java.util.*;

public class SpiralMatrixII {

    public static void main(String[] args) {
        
        int n = 3;

        int[][] mat = new int[n][n];

        int colStart = 0 , colEnd = mat[0].length-1;
        int rowStart =0 , rowEnd = mat.length-1;
        int num =1;

        while(colStart <= colEnd && rowStart <= rowEnd ){

            for(int i=colStart ;i<=colEnd;i++){
                mat[rowStart][i] = num++;
            }
            rowStart++;

            for(int i=rowStart;i<=rowEnd;i++){
                mat[i][colEnd] = num++;
            }
            colEnd--;

            if(colStart < colEnd){

            
            for(int i=colEnd;i>=colStart;i--){
                mat[rowEnd][i] = num++;
            }
            rowEnd--;
            }

            if(rowStart < rowEnd){

            

            for(int i=rowEnd;i>=rowStart;i--){
                mat[i][colStart] = num++;
            }
            colStart++;
            }
        }

        System.out.println(Arrays.deepToString(mat));
    }
    
}
