// leetcode 860
// time - 0(n)
// space - o(1)

public class LemonadeChange {

    public static void main(String[] args) {
        
        int[] arr = new int[] {5,5,5,10,20};

        System.out.println(giveChnage(arr));
    }

    private static boolean giveChnage(int[] arr){

        int five =0 , ten =0;

        for(int val : arr){

            if(val == 5){
                five++;
            }
            else if(val == 10){

                if(five > 0){
                    five--;
                    ten++;
                }
                else{
                    return false;
                }
            }
            else{

                if(five > 0 && ten > 0){
                    five--;
                    ten--;
                }
                else if (five > 2){
                    five-=3;
                }
                else{
                    return false;
                }
            }
        }

        return true;
    }
    
}
