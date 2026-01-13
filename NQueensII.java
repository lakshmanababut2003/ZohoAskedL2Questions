// leetcode 52

public class NQueensII {

    public static void main(String[] args) {
        
        int n =1;

        boolean[][] mat = new boolean[n][n];
        System.out.println(nQueens(mat , 0));
    }

    private static int nQueens(boolean[][] mat , int row){

        if(row == mat.length){
            return 1;
        }

        int count =0;

        for(int col=0;col < mat.length;col++){

            if(isSafe(row , col , mat)){

                mat[row][col] = true;
                count+=nQueens(mat, row+1);
                mat[row][col] = false;

            }
        }

        return count;
    }

    private static boolean isSafe( int row , int col , boolean[][] mat){

        for(int i=0;i<row;i++){

            if(mat[i][col]){
                return false;
            }
        }

        for(int i=row , j=col;i>=0 && j>=0 ;i--,j--){
            if(mat[i][j]){
                return false;
            }
        }

        for(int i=row,j=col;i>=0 && j<mat.length ;i-- ,j++){
            if(mat[i][j]){
                return false;
            }
        }

        return true;
    }
    
}
