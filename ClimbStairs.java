// leetcode 70

public class ClimbStairs {

    public static void main(String[] args) {
        
        int n = 30;

        int a=0 , b=1;

        for(int i=0;i<n;i++){
            int c = a+b;
            a=b;
            b=c;
        }

        System.out.println(b);
    }
    
}
