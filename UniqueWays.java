// leetcode 62

public class UniqueWays {

    public static void main(String[] args) {
        
        int m = 3 , n=7;

        int N = m+n-2;
        int r = Math.min(m-1 , n-1);
        int res = 1;

        for(int i=1;i<=r;i++){
            res = res*(N-r+i)/i;
        }

        System.out.println(res);
    }
    
}
