// leetcode 394

// Time Complexity:
// O(n + L)
// Space Complexity:
// O(n + L)
// (where n = length of input string, L = length of decoded output)

import java.util.*;

public class DecodeString {

    public static void main(String[] args) {
        
        String s = "3[a]2[bc]";

        Stack<Integer> nums = new Stack<>();
        Stack<StringBuilder> str = new Stack<>();

        int n = s.length();

        int num = 0 ;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){

            char curr = s.charAt(i);
            if(Character.isDigit(curr)){
                num = 10 * num + (curr - '0');
            }
            else if(curr == '['){
                nums.push(num);
                str.push(sb);
                num =0;
                sb=new StringBuilder();

            }
            else if(curr == ']'){

                String temp = sb.toString();
                sb = new StringBuilder(temp.repeat(nums.pop()));
                sb=str.pop().append(sb);

            }
            else{
                sb.append(curr);
            }
        }

        System.out.println(sb.toString());

    }
    
}
