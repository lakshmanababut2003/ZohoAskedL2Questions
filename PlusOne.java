// Leetcode 66

import java.util.*;

public class PlusOne{

    public static void main(String[] args){

        int[] arr = new int[] {9};

        int n=arr.length;

        for(int i=n-1;i>=0;i--){

            if(arr[i] + 1 != 10){
                arr[i]+=1;
                System.out.println(Arrays.toString(arr));
                return;
            }

            arr[i] = 0;
        }

        int[] res = new int[n+1];

        res[0] = 1;

        System.out.println(Arrays.toString(res));
    }
}