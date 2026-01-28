// leetcode 134

// time - o(n)
// space - o(1)

public class GasStation {

    public static void main(String[] args) {
        
        int[] gas = new int[] {1,2,3,4,5};
        int[] cost = new int[] {3,4,5,1,2};

        int totalGas = 0;

        for(int i=0;i<gas.length;i++){
            totalGas += gas[i] - cost[i];
        }

        if(totalGas < 0){
            System.out.println(-1);
            return;
        } 

        int startInd = 0 , remain = 0;

        for(int i=0;i<gas.length;i++){

            int currGas = gas[i] + remain;
            remain = currGas - cost[i];

            if(remain < 0){
                remain = 0;
                startInd = i+1;
            }
        }

        System.out.println(startInd);
    }
    
}
