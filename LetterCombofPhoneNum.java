// leetcode 17

// Time Complexity:
// O(4ⁿ) -ltters (if abc 3 power n)

// Space Complexity:
// O(n)

import java.util.*;

public class LetterCombofPhoneNum {

    static HashMap<Character , String> map ;
    public static void main(String[] args) {

        String s = "23";


        map = new HashMap<>();
        map.put('2' , "abc");
        map.put('3' , "def");
        map.put('4' , "ghi");
        map.put('5' , "jkl");
        map.put('6' , "mno");
        map.put('7' , "pqrs");
        map.put('8' , "tuv");
        map.put('9' , "wxyz");

        List<String> ans = new ArrayList<>();
        helper(s , 0 , new StringBuilder() , ans);
        System.out.println(ans);
        
    }

    private static void helper(String s , int idx , StringBuilder sb , List<String> ans){

        if(idx == s.length()){
            ans.add(sb.toString());
            return;
        }

        String letters = map.get(s.charAt(idx));

        for(char letter : letters.toCharArray()){
            sb.append(letter);
            helper(s , idx+1 , sb , ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    
}
