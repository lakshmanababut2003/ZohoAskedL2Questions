// leetcode 76
// Time Complexity: O(n)
// Space Complexity: O(1) (since the array size is fixed at 128)

public class MinimumWindowSubStr {

    public static void main(String[] args) {
        
        String s = "ADOBECODEBANC";
        String t = "ABC";

        int[] tCount = new int[128];

        for(int i=0;i<t.length();i++){
            tCount[t.charAt(i)]++;
        }

        int left =0 , right =0 , found=0 , toFind = t.length();
        int minWindow=Integer.MAX_VALUE;

        String res = "";

        char[] sChar = s.toCharArray();

        while(right < sChar.length){

            char curr = sChar[right];

            tCount[curr]--;

            if(tCount[curr] >=0){
                found++;
            }

            while(found == toFind){

                if(minWindow > right -left +1){
                    minWindow = right-left+1;
                    res =s.substring(left , right+1);
                }

                tCount[sChar[left]]++;

                if(tCount[sChar[left]] > 0){
                    found--;
                }

                left++;
            }

            right++;
        }

        System.out.println(res);
    }
}
