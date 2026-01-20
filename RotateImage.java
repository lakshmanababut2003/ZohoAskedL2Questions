// leetcode 48

// time -o(n sqaure)
// space - o(1)

import java.util.Arrays;

public class RotateImage {

    public static void main(String[] args) {
        
        int[][] mat = new int[][]{
            {1,2,3} , {4,5,6},{7,8,9}
        };

        int n = mat.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(mat , i , j);
            }
        }

        for(int i=0;i<n;i++){

            int left =0 , right = n-1;

            while(left < right){

                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;

                left++;
                right--;
            }
        }

        System.out.println(Arrays.deepToString(mat));
    }

    private static void swap(int[][] mat , int i , int j){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
    
}
