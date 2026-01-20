// leetcode 3
// time -O(n)
// space - o(256)


public class LongestSubStrWithoutRepeat {

    public static void main(String[] args) {
        
        String s = "abcabcbb";

        boolean[] visit = new boolean[256];
        int start =0 , maxLen = 0 , maxStart =0;

        for(int i=0;i<s.length();i++){

            char curr = s.charAt(i);

            while(visit[curr]){

                visit[s.charAt(start)] = false;
                start++;
            }

            visit[curr] = true;

            if(maxLen < i-start+1){
                maxLen = i-start+1;
                maxStart = start;
            }

        }

        System.out.println("MaxLen : " + maxLen);

        for(int i=maxStart;i<maxStart+maxLen;i++){
            System.out.print(s.charAt(i));
        }
    }
    
}
