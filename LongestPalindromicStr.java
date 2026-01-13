
// leetcode 5

public class LongestPalindromicStr {

    public static void main(String[] args) {
        
        String s = "ababd";

       if(s == null || s.trim().length() == 0){
        return;
       }

       int start =0 , end =0 , maxLen = 0;

       for(int i=0;i<s.length();i++){

            int odd = getPalinLen(s, i, i);
            int even = getPalinLen(s , i , i+1);

            maxLen = Math.max(odd , even);

            if(maxLen > end - start){
                start = i - (maxLen -1)/2;
                end = i+maxLen/2;
            }
       }

       System.out.println(s.substring(start , end+1));
    }

    private static int getPalinLen( String s,int l , int r){

        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }

        return r-l-1;
    }
}
