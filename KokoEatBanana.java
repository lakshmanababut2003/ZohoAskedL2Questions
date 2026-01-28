// leetcode 875

// time - o(n log M)
// space - o(1)
// M - maximum of pile 


public class KokoEatBanana {

    public static void main(String[] args) {
        
        int[] arr = new int[]{3,6,7,11};
        int h = 8;

        int low = 1 , high =0;

        for(int ele : arr){
            high = Math.max(high , ele);
        }

        while(low <= high){

            int mid = low + (high - low )/2;

            if(calculateHour(arr , mid) <= h){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        System.out.println(low);
    }

    private static int calculateHour(int[] arr , int k){

        int totalHours =0;

        for(int pile : arr){
            totalHours += Math.ceil((double)pile / (double)k);
        }

        return totalHours;
    }
    
}
