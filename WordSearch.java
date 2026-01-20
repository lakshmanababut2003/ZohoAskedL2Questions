// leetcode 79

// Time Complexity: O(m · n · 4ˡ)
// Space Complexity: O(m · n) (visited array + recursion stack)
// (where l = length of the word)

public class WordSearch {
    
    public static void main(String[] args) {
        
        char[][] board = new char[][]{
            {'A' , 'B' , 'C' , 'E'} ,
            {'S' , 'F' , 'C' , 'S'},
            {'A' , 'D' , 'E' , 'E'}
        };

        String s = "ABCB";

        
        int m = board.length;
        int n = board[0].length;

        boolean[][] dp = new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(board[i][j] == s.charAt(0)){

                    if(dfs(board , dp , s , i , j , 0)){
                        System.out.println(true);
                        return;
                    }
                }
            }
        }

        System.out.println(false);
    }

    private static boolean dfs(char[][] b , boolean[][] dp , String s , int i , int j , int k){

        if(s.length() == k){
            return true;
        }

        if(i<0 || i>=b.length || j<0 || j>=b[0].length || dp[i][j] || s.charAt(k) != b[i][j]){
            return false;
        }

        dp[i][j] = true;

        if(dfs(b , dp , s , i+1 , j , k+1) || 
            dfs(b , dp , s , i-1,j,k+1) ||
            dfs(b , dp , s , i , j+1 , k+1) ||
            dfs(b , dp ,s,  i, j-1 , k+1)){
                return true;
            } 

            dp[i][j] = false;
            return false;
    }

   


}
