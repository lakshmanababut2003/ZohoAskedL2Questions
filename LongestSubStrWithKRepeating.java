// leetcode 395

public class LongestSubStrWithKRepeating {

    public static void main(String[] args) {
        
        String s = "aababa";
        int k = 3;

        System.out.println(findLongestSubstr(s , k));
    }

    private static int findLongestSubstr(String s , int k){

        int len = s.length();

        int[] chArr = new int[26];

        for(char c : s.toCharArray()){
            chArr[c-'a']++;
        }

        for(int i=0;i<s.length();i++){

            if(chArr[s.charAt(i)-'a'] < k){

                int left = findLongestSubstr(s.substring(0 , i), k);
                int right = findLongestSubstr(s.substring(i+1), k);
                return Math.max(left , right);
            }
        }

        return len;
    }
    
}
