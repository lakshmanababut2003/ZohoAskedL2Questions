// leetcode  1572

// time - o(n)
// space -O(1)



public class DiagonalMatrixSum {

    public static void main(String[] args) {
        
        int[][] mat = new int[][]{
            {1,2,3} , {4,5,6} , {7,8,9}
        };

        int sum =0 , n = mat.length;

        for(int i=0;i<n;i++){
            sum+= mat[i][i];

            if(i != n-i-1){
                sum+=mat[i][n-i-1];
            }
        }

        System.out.println(sum);
    }
    
}
