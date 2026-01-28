// leetcode 118

// Time Complexity:
// O(n²)

// Space Complexity:
// O(n²) (including output)
// O(n) auxiliary space

import java.util.*;

public class PascalTriangle {

    public static void main(String[] args){

        int numRow = 5;

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<numRow ;i++){
            ans.add(pattern(i));
        }

        System.out.println(ans);

    }

    private static List<Integer> pattern(int row){

        List<Integer> temp = new ArrayList<>();

        long val =1;
        temp.add(1);

        for(int i=1;i<=row;i++){

            val = val * (row - i +1);
            val = val/i;
            temp.add((int) val);
        }

        return temp;
    }
    
}
