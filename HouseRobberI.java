// leetcode 198
// time - o(n)
// space - o(1)

public class HouseRobberI {

    public static void main(String[] args) {
        
        int[] arr = new int[]{1,2,3,1};

        int len = arr.length;

        if(len == 1){
            System.out.println(arr[0]);
            return;
        }

        System.out.println(findMaxRob(arr , 0 , len-1));
    }

    private static int findMaxRob(int[] arr , int start , int end){

        int maxRob =0 , prevRob =0;

        for(int i=start;i<=end;i++){

            int temp = Math.max(maxRob , prevRob+arr[i]);
            prevRob = maxRob;
            maxRob = temp;
        }

        return maxRob;
    }
    
}
