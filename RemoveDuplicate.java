// leetcode 26

public class RemoveDuplicate {

    public static void main(String[] args) {
        
        int[] arr = new int[]{1, 1 , 2};

        int pos =0;

        for(int i=1;i<arr.length;i++){

            if(arr[pos] == arr[i]){
                arr[pos++] = arr[i];
            }

            arr[pos] = arr[i];
        }

        System.out.println(pos+1);

        for(int i=0;i<=pos;i++){
            System.out.print(arr[i] + " ");
        }

       
    }
    
}
