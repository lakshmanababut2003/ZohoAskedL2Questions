// leetcode 739

import java.util.*;

public class DailyTemperature {

    public static void main(String[] args) {
        
        int[] temp = new int[] {73,74,75,71,69,72,76,73};

        int n = temp.length;

        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty() && temp[st.peek()] <= temp[i]){
                st.pop();
            }

            if(!st.isEmpty()){
                res[i] = st.peek()-i;
            }

            st.push(i);
        }

        System.out.println(Arrays.toString(res));
    }
    
}
