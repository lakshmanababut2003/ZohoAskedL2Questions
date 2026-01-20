// leetcode 11

// time o(n)
// space o(1)

public class ContainerWithMostWater {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1,8,6,2,5,4,8,3,7};

        int left = 0 , right = arr.length-1;
        int max=Integer.MIN_VALUE;

        while(left < right){

            int w = right-left;
            int h = Math.min(arr[left] , arr[right]);
            max = Math.max(max , w*h);

            if(arr[left] < arr[right]){
                left++;
            }
            else{
                right--;
            }
        }

        System.out.println(max);
    }
    
}
