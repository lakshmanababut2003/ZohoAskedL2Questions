// leetcode 32
// time - o(n)
// space - o(n)

import java.util.*;

public class LongestValidParthess {

    public static void main(String[] args) {
        
        String s = "";

        Stack<Integer> st = new Stack<>();
        boolean[] isValid = new boolean[s.length()];

        for(int i=0;i<s.length();i++){

            if(s.charAt(i) == '('){
                st.push(i);
            }
            else if(!st.isEmpty()){
                int idx = st.pop();
                isValid[idx] = true;
                isValid[i] = true;
            }
        }

        int max = 0 , count =0;

        for(boolean is : isValid){
            max = Math.max(max , count = is ? count+1 : 0);
        }

        System.out.println(max);
    }
    
}
