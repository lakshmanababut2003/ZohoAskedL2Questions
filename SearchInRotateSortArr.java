// leetcode 33

public class SearchInRotateSortArr {

    public static void main(String[] args) {
        
        int[] arr = new int[] {4,5,6,7,0,1,2};
        int target = 0;

        int l =0 , r=arr.length-1;

        while(l <= r){

            int mid = (l+r) / 2;

            if(arr[mid] == target){
                System.out.println(mid);
                return;
            }

            if(arr[l] <= arr[mid]){

                if(arr[l] > target || arr[mid] < target){
                    l = mid+1;
                }
                else{
                    r = mid-1;
                }
            }
            else{
                if(arr[r] < target || arr[mid] > target){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }

            }
        }

        System.out.println(-1);
    }
    
}
