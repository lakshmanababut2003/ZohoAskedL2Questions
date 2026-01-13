// leetcode 45

public class JumpGameII {

    public static void main(String[] args) {
        
        int[] arr = new int[]{0};

        int end =0 , farthest = 0 , jump=0;

        for(int i=0;i<arr.length-1;i++){

            farthest = Math.max(farthest , i+arr[i]);

            if(i == end){

                if(end == farthest){
                    System.out.println(-1);
                    return;
                }

                end = farthest;
                jump++;
            }
        }

        System.out.println(jump);
    }
    
}
