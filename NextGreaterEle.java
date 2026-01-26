// leetcode 496

// time - o(n)
// space - o(n)

import java.util.*;

public class NextGreaterEle {

    public static void main(String[] args) {

        int[] arr1 = new int[] {1,3,5,2,4};
        int[] arr2 = new int[]{6,5,4,3,2,1,7};
        
        HashMap<Integer , Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int num :arr2){

            while(!st.isEmpty() && st.peek() < num){
                map.put(st.pop() , num);
            }

            st.push(num);
        }

        int[] res = new int[arr1.length];

        for(int i=0;i<arr1.length;i++){
            res[i] = map.getOrDefault(arr1[i] , -1);
        }

        System.out.println(Arrays.toString(res));
    }
    
}
