// leetcode 91

public class DecodeWays {

    public static void main(String[] args) {
        
        String s = "111111111111111111111111111111111111111111111";

        int len = s.length();

        int[] dp = new int[len+1];

        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        for(int i=2;i<=len;i++){

            int oneDigit = Integer.parseInt(s.substring(i-1 , i));
            int twoDigit = Integer.parseInt(s.substring(i-2 , i));

            if(oneDigit >=1){
                dp[i]+= dp[i-1];
            }

            if(twoDigit >= 10 && twoDigit <= 26){
                dp[i]+=dp[i-2];
            }
        }

        System.out.println(dp[len]);
    }
    
}
