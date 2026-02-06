// leetcode 435

// time - o(n log n)
// space - o(1);

import java.util.*;

public class NonOverlapInterval {

    public static void main(String[] args) {
        
        int[][] intervals = new int[][] {
            {1,2} , {2,3} , {3,4} , {1,3}
        };

        int n = intervals.length;
        Arrays.sort(intervals , (a,b)->a[1]-b[1]);

        // manual sorting
        // for(int i=0;i<n-1;i++){

        //     int minIdx = i;

        //     for(int j=i+1;j<n;j++){
        //         if(intervals[j][1] < intervals[minIdx][1]){
        //             minIdx =j;
        //         }
        //     }

        //     int[] temp = intervals[i];
        //     intervals[i] = intervals[minIdx];
        //     intervals[minIdx] = temp;
        // }

        int overlap=0;
        int lastEnd = intervals[0][1];

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
