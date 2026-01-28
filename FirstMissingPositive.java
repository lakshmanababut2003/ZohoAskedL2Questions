// leetcode 41

// time -o(n log n)
// space - o(1)

import java.util.*;

public class FirstMissingPositive {

    static Random random = new Random();
    public static void main(String[] args) {
        
        int[] arr = new int[] {3,4,-1,1};

        // sort(arr , 0 , arr.length-1);
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));       

        int target = 1;

        for(int i=0;i<arr.length;i++){

            if(arr[i] <= 0){
                continue;
            }

            if(arr[i] == target){
                target+=1;
            }
            else if(target < arr[i]){
                System.out.println(target);
                return;
            }
        }

        System.out.println(target);
    }

    // private static void sort(int[] arr , int l , int r){

    //     if(l > r){
    //         return;
    //     }

    //     int randomInd = l + (random.nextInt(r-l+1));
    //     swap(arr , l ,randomInd);

    //     int pivot = arr[l];
    //     int lt = l;
    //     int gt = r;
    //     int i=l+1;

    //     while(i <= gt){
    //         if(arr[i] < pivot){
    //             swap(arr , lt , i);
    //             lt++;
    //             i++;
    //         }
    //         else if(arr[i] > pivot){
    //             swap(arr , i , gt);
    //             gt--;
    //         }
    //         else{
    //             i++;
    //         }
    //     }

    //     sort(arr , l , lt-1);
    //     sort(arr , gt+1 , r);
    // }

    // private static void swap(int[] arr ,int i, int j){
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j]=temp;
    // }
    
}
