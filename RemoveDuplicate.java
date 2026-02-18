// leetcode 26

public class RemoveDuplicate {

    public static void main(String[] args) {
        
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};

       int pos =1;

       for(int i=0;i<arr.length;i++){
            if(i+1 < arr.length && arr[i] != arr[i+1]){
                arr[pos++] = arr[i+1];
            }
       }

       System.out.println(pos);

        for(int i=0;i<pos;i++){
            System.out.print(arr[i] + " ");
        }

       
    }
    
}
