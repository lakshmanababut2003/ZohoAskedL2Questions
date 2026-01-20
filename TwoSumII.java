// leetcode 167

// time - O(n)
// space -o(1)

public class TwoSumII {

    public static void main(String[] args) {
        
        int[] arr = new int[] {2,7,11,15};
        int target = 9;

        int l=0 , r=arr.length-1;

        while(l < r){

            int sum = arr[l] + arr[r];

            if(sum == target){
                System.out.println("[" + (l+1) +" , " + (r+1) + "]");
                return;
            }
            else if(sum < target){
                l++;
            }
            else{
                r--;
            }
        }

        System.out.println("[" + -1 + " , " + -1 + "]");
    }
    
}
