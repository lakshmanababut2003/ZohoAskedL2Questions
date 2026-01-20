// leetcode 139

// Time Complexity: O(n · m · k)
// Space Complexity: O(n)
// (where n = length of string s, m = number of words in the dictionary, k = average word length)

import java.util.*;

public class WordBreak {

    public static void main(String[] args) {
        
        String s = "leetcode";
        List<String> wd = new ArrayList<>();
        wd.add("leet");
        wd.add("code");

        boolean[] dp = new boolean[s.length()+1];

        dp[0] = true;

       for(int i=1;i<=s.length();i++){

        for(String w : wd){

            int start = i-w.length();

            if(start >= 0 && dp[start] && s.substring(start , i).equals(w)){
                dp[i] = true;
                break;
            }
        }
       }
        
        System.out.println(dp[s.length()]);
    }
    
}
