// Problem 
// ⦁ Rearrange an array without using extra space so that: 
// ⦁ Even numbers are arranged in descending order. 
// ⦁ Odd numbers are arranged in ascending order. 
// ⦁ The relative positions of odd/even remain fixed (in-place transformation). 
// Example 
// Input: 9 4 3 2 7 8 5
//  Output: 3 8 5 4 7 2 9

import java.util.Arrays;

public class OddEvenSwapIndexFix {

    public static void main(String[] args) {
        
        int[] arr = new int[]{8,6,7,10,5,1};

        int n = arr.length;

        for(int i=0;i<n;i++){

            if(arr[i] % 2 == 0){

                int maxInd = i;

                for(int j=i+1;j<n;j++){
                    if(arr[maxInd] < arr[j] && arr[j] % 2 == 0){
                        maxInd = j;
                    }
                }

                swap(arr , i , maxInd);

            }
            else{

                int minInd = i;

                for(int j=i+1;j<n;j++){
                    if(arr[i] > arr[j] && arr[j] % 2 != 0){
                        minInd = j;
                    }
                }

                swap(arr , i ,minInd);
            }
        }

     
        System.out.println("Final : "+Arrays.toString(arr));
    }

    private static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

   
    
}
