// // leetcode 140
// Time Complexity: O(2ⁿ · n)
// Space Complexity: O(n) (recursion stack, excluding output)

import java.util.*;

public class WordBreakII {

    public static void main(String[] args) {
        
        String s = "catsanddog";
        List<String> wd = new ArrayList<>();
        wd.add("cat");
        wd.add("cats");
        wd.add("and");
        wd.add("sand");
        wd.add("dog");

        HashSet<String> hs = new HashSet<>(wd);
        System.out.println(helper(s , 0 , hs));
    }

    private static List<String> helper(String s , int start , HashSet<String> set){

        List<String> validSubStr = new ArrayList<>();

        if(start == s.length()){
            validSubStr.add("");
        }

        for(int end = start+1;end <= s.length();end++){

            String prefix = s.substring(start , end);

            if(set.contains(prefix)){

                List<String> suffixes = helper(s , end , set);

                for(String str : suffixes){
                    validSubStr.add(prefix + (str.equals("") ? "" : " ") + str);
                }
            }
        }

        return validSubStr;
    }

 
}
