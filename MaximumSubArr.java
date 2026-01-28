// leetcode 53
// time - o(n)
// space - o(1)


public class MaximumSubArr {

    public static void main(String[] args) {
        
        int[] arr = new int[] {-2,1,-3,4,-1,2,1,-5,4};

        int sum =0 , maxSum = Integer.MIN_VALUE;
        int maxStart =0 , maxLen =0 , start=0;;

        for(int ele: arr){
            maxSum = Math.max(ele , maxSum);
        }

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(sum < 0){
                sum=0;
                start = i+1;
            }
            else{
               
                if(maxSum < sum){
                    maxLen = i;
                    maxSum = sum;
                    maxStart = start;
                }
            }
        }

        System.out.print("[");
        for(int i=maxStart;i<=maxLen;i++){
            System.out.print(arr[i] + " , ");
        }
        System.out.println("]");

        System.out.println();

        System.out.println(maxSum);
    }
    
}
