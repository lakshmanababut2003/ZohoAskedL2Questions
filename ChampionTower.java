// leetcode 799
// time - o(r sqauare)
// space - o(r sqauare) r means query_row


public class ChampionTower {

    public static void main(String[] args) {

        int query_row = 1 , poured = 2, query_glass = 1;

        double[][] dp = new double[101][101];

        dp[0][0] = poured;

        for(int i=0;i<=query_row;i++){
            for(int j=0;j<=i;j++){

                if(dp[i][j] >= 1.0){

                    double overflow = dp[i][j] - 1.0;
                    double share = overflow / 2.0;

                    dp[i+1][j] += share;
                    dp[i+1][j+1] +=share;
                    dp[i][j] = 1;
                }
            }
        }

        System.out.println(dp[query_row][query_glass]);
    }
    
}
