// leetcode 435

// time - o(n log n)
// space - o(1);

import java.util.*;

public class NonOverlapInterval {

    public static void main(String[] args) {
        
        int[][] intervals = new int[][] {
            {1,2} , {2,3} , {3,4} , {1,3}
        };

        Arrays.sort(intervals , (a,b)->a[1]-b[1]);

        int overlap=0;
        int lastEnd = intervals[0][1];
        int n = intervals.length;

        for(int i=1;i<n;i++){

            if(lastEnd > intervals[i][0]){
                overlap++;
            }
            else{
                lastEnd = intervals[i][1];
            }
        }

        System.out.println(overlap);
    }
    
}
