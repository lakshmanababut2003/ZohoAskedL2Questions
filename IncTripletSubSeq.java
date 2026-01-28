// leetcode 334
// time - o(n)
// space - o(1)

public class IncTripletSubSeq {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1,2,3,4,5};

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for(int ele : arr){

            if(ele <= a){
                a = ele;
            }
            else if(ele <=b){
                b=ele;
            }
            else{
                System.out.println(true);
                return;
            }
        }

        System.out.println(false);
    }
    
}
