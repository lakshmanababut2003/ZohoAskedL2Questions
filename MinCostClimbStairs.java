// leetcode 746
// time -o(n)
// space - o(1)

public class MinCostClimbStairs {

    public static void main(String[] args) {
        
        int[] arr = new int[] {10 , 15 , 20};

        int first = arr[0];
        int second = arr[1];

        for(int i=2;i<arr.length;i++){

            int temp = arr[i] + Math.min(first , second);
            first = second;
            second = temp;
        }

        System.out.println(Math.min(first , second));
    }
    
}
