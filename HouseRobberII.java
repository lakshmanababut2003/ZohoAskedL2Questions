// leetcode 213
// time - o(n)
// space - o(1)

public class HouseRobberII {

    public static void main(String[] args) {
        
        int[] arr = new int[] {2,3,2};

        int len = arr.length;

        if(len == 1){
            System.out.println(arr[0]);
            return;
        }

        System.out.println(Math.max(findMaxRob(arr , 0 , len-2) , findMaxRob(arr , 1 , len-1)));
    }

    private static int findMaxRob(int[] arr , int start , int end){

        int prevRob =0 , maxRob =0;

        for(int i=start;i<=end;i++){

            int temp = Math.max(maxRob , arr[i]+prevRob);
            prevRob = maxRob;
            maxRob = temp;
        }

        return maxRob;
    }
    
}
