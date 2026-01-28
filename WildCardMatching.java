// leetcode 44

// Time Complexity:
// O(n × m)

// Space Complexity:
// O(n × m)

// Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:
// '?' Matches any single character.
// '*' Matches any sequence of characters (including the empty sequence).
// The matching should cover the entire input string (not partial).

public class WildCardMatching {

    public static void main(String[] args) {
        
        String s = "aa";
        String p = "*";

        char[] str = s.toCharArray();
        char[] pat = p.toCharArray();

        int writeInd = 0 ;
        boolean isFirst = true;

        for(int i=0;i<pat.length;i++){

            if(pat[i] == '*'){

                if(isFirst){
                    pat[writeInd++] = pat[i];
                    isFirst = false;
                }
            }
            else{
                pat[writeInd++] = pat[i];
                isFirst = true;
            }
        }

        boolean[][] dp = new boolean[str.length+1][writeInd+1];

        if(writeInd > 0 && pat[0] == '*'){
            dp[0][1] = true;
        }

        dp[0][0] = true;

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){

                if(pat[j-1] == '?' || str[i-1] == pat[j-1]){
                    dp[i][j] = dp[i-1][j-1];
                }
                else if(pat[j-1] == '*'){
                    dp[i][j] = dp[i][j-1] || dp[i-1][j];
                }
            }
        }

        System.out.println(dp[s.length()][writeInd]);
    }
    
}
