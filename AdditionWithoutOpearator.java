// leetcode 371

public class AdditionWithoutOpearator {

    public static void main(String[] args) {
        
        int a = 5;
        int b =3;

        // method 1(recursion)
        System.out.println(getSum1(a,b));

        // method 2(loop)
        System.out.println(getSum2(a,b));
    }

    private static int getSum1(int a , int b){

        if(b == 0){
            return a;
        }

        return getSum1(a ^ b , (a&b) << 1);

    } 

    private static int getSum2(int a , int b){

        while(b != 0){

            int sum = a^b;
            int carry = (a&b) << 1;

            a = sum;
            b = carry;
        }

        return a;
    }
    
}
