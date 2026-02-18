// leetcode 3713

public class LongestBalancedSubStrI {

    public static void main(String[] args) {
        
        String s = "zzabccy";

        int max =0;
        int n = s.length();

        for(int i=0;i<n;i++){

            int[] freq = new int[26];

            for(int j=i;j<n;j++){

                char c = s.charAt(j);
                freq[c-'a']++;

                if(isSameFreq(freq)){
                    max = Math.max(max , j-i+1);
                }
            }
        }

        System.out.println(max);
    }

    private static boolean isSameFreq(int[] freq){

        int val =0;

        for(int a : freq){

            if(a == 0){
                continue;
            }

            if(val == 0){
                val = a;
            }
            else if(val != a){
                return false;
            }
        }

        return true;
    }
    
}
