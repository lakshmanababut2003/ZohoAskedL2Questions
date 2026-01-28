// leetcode 14
// time - 0(n log n)
// space o(1)


import java.util.*;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        
        String[] strs = new String[] {"flower","flow","flight"};

        Arrays.sort(strs);

        int r = strs.length-1 , i =0;
        StringBuilder sb = new StringBuilder();

        while(i < strs[0].length() && i < strs[r].length()){
            if(strs[0].charAt(i) == strs[r].charAt(i)){
                sb.append(strs[0].charAt(i));
            }
            else {
                break;
            }

            i++;
        }

        System.out.println(sb);
    }
    
}
