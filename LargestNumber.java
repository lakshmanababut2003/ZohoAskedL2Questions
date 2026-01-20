// leetcode 179

// Time Complexity: O(n log n · k)
// Space Complexity: O(n · k)

import java.util.*;

public class LargestNumber {
    
    public static void main(String[] args) {
        
        int[] arr = new int[]{3,30,34,5,9};

        String[] str = new String[arr.length];

        for(int i=0;i<str.length;i++){
            str[i] = String.valueOf(arr[i]);
        }

        Arrays.sort(str , (a,b)->{
            String order1 = a+b;
            String order2 = b+a;
            return order2.compareTo(order1);
        });

        if(str[0].equals("0")){
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();

        for(String s : str){
            sb.append(s);
        }

        System.out.println(sb);
    }
}
