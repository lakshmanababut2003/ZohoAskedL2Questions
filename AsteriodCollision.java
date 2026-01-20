// leetcode 735
// time - o(n)
// space - o(n)

import java.util.*;

public class AsteriodCollision{

    public static void main(String[] args){


        int[] arr = new int[] {10 , 2 , -5};

        Stack<Integer> st = new Stack<>();

        for(int a : arr){

            if(a > 0){
                st.push(a);
            }
            else{

                while(!st.isEmpty() && st.peek() > 0 && st.peek() < -a){
                    st.pop();
                }

                if(st.isEmpty() || st.peek() < 0){
                    st.push(a);
                }
                
                if(st.peek() == -a){
                    st.pop();
                }
            }
        }

        int ind = st.size()-1;

        int[] res = new int[st.size()];

        while(!st.isEmpty()){
            res[ind--] = st.pop();
        }

        System.out.println(Arrays.toString(res));
    }

    
}