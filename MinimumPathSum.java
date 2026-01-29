// leetcode 64

// time - o(m*n)
// space - o(m*n)

public class MinimumPathSum {

    public static void main(String[] args) {
        
        int[][] mat = new int[][]{
            {1,3,1} , {1,5,1} , {4,2,1}
        };

        int m = mat.length;
        int n = mat[0].length;

        int[][] dp = new int[m][n];

        dp[0][0] = mat[0][0];

        for(int i=1;i<m;i++){
            dp[i][0] = dp[i-1][0] + mat[i][0];
        }

        for(int j=1;j<n;j++){
            dp[0][j] = dp[0][j-1] + mat[0][j];
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = mat[i][j] + Math.min(dp[i-1][j] , dp[i][j-1]);
            }
        }

        System.out.println(dp[m-1][n-1]);
    }
    
}
