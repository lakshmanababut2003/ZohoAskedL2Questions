// leetcode 10

// Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

// '.' Matches any single character.​​​​
// '*' Matches zero or more of the preceding element.

// Time Complexity:
// O(m × n)
// Space Complexity:
// O(m × n)

public class RegularExpressionMatch {

    public static void main(String[] args) {
        
        String s = "mississippi";
        String p = "mis*is*ip*.";

        int m = s.length();
        int n = p.length();

        boolean[][] dp = new boolean[m+1][n+1];

        dp[0][0] = true;

        for(int j=2;j<=n;j++){
            if(p.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-2];
            }
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){

                char sc = s.charAt(i-1);
                char pc = p.charAt(j-1);

                if(pc == '.' || pc == sc){
                    dp[i][j] = dp[i-1][j-1];
                }
                else if(pc == '*'){

                    dp[i][j] = dp[i][j-2];
                    char prev = p.charAt(j-2);

                    if(prev == '.' || pc == sc){
                        dp[i][j] |= dp[i-1][j];
                    }
                }
            }
        }

        System.out.println(dp[m][n]);
    }
    
}
