// leetcode 119

// time o(rowIndex)
// space - o(1)

import java.util.*;

public class PascalTriangleII {

    public static void main(String[] args) {
        
        int rowIndex = 3;

        List<Integer> ans = new ArrayList<>();

        long val = 1;
        ans.add(1);

        for(int i=1;i<=rowIndex;i++){
            val = val * (rowIndex - i +1);
            val = val /i;
            ans.add((int) val);
        }

        System.out.println(ans);
    }
    
}
