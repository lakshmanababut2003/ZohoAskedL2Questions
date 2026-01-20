// leetcode 55
// time - o(n)
// space - o(1)

public class JumpGameI {

    public static void main(String[] args) {
        
        int[] arr = new int[]{2,3,1,1,4};

        int end =0 , farthest =0;

        for(int i=0;i<arr.length-1;i++){
            farthest = Math.max(farthest , i+arr[i]);

            if(i == end){

                if(farthest == end){
                    System.out.println(false);
                    return;
                }

                end = farthest;
            }
        }

        System.out.println(true);
    }
    
}
