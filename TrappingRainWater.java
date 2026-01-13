// leetcode 42

public class TrappingRainWater {

    public static void main(String[] args) {
        
        int[] arr = new int[] {4,2,0,3,2,5};

        int left =0 , right = arr.length-1;
        int leftMax =0 , rightMax = 0;
        int total =0;

        while(left < right){

            if(arr[left] < arr[right]){

                if(leftMax < arr[left]){
                    leftMax = arr[left];
                }

                total+= leftMax - arr[left];
                left++;
            }
            else{

                if(rightMax < arr[right]){
                    rightMax = arr[right];
                }

                total+= rightMax - arr[right];
                right--;
            }
        }

        System.out.println(total);
    }
    
}
