// leetcode 1306
// time - o(n)
// space - o(n) - reursion stack

public class JumpGameIII {

    public static void main(String[] args) {
        
        int[] arr = new int[] {4,2,3,0,3,1,2};
        int start = 5;

        System.out.println(canJump(arr , start));
    }

    private static boolean canJump(int[] arr , int start){

        if(start < 0 || start >= arr.length || arr[start] < 0){
            return false;
        }

        if(arr[start] == 0){
            return true;
        }

        int jump = arr[start];
        arr[start] = - arr[start];

        return canJump(arr , start+jump) || canJump(arr , start-jump);
    }
    
}
