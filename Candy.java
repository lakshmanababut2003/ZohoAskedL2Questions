// leetcode 135
// time - o(n)
// space - o(1)


public class Candy {

    public static void main(String[] args){

        int[] arr = new int[] {1,2,87,87,87,2,1};

       int n = arr.length;

       int total = n , i=1;

       while(i < n){

        if(arr[i] == arr[i-1]){
            i++;
            continue;
        }

        int leftMax =0;
        while(i < n && arr[i] > arr[i-1]){
            i++;
            leftMax++;
            total+=leftMax;
        }

        if(i == n){
            System.out.println(total);
            return;
        }

        int rightMax =0;
        while(i < n && arr[i] < arr[i-1]){
            i++;
            rightMax++;
            total+=rightMax;
        }

        total-= Math.min(leftMax , rightMax);

       }

       System.out.println(total);
    }
    
}
