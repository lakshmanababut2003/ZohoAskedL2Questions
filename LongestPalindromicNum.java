// leetcode 2384

// time - o(n)
// space - o(1)

public class LongestPalindromicNum {

    public static void main(String[] args) {
        
        String s = "444947137";

        int[] occur = new int[10];

        for(char c : s.toCharArray()){
            occur[c-48]++;
        }

        int single =-1;
        StringBuilder sb = new StringBuilder();

        for(int i=9;i>=0;i--){

            if(sb.length()==0 && i==0){
                continue;
            }

            while(occur[i] > 1){
                sb.append((char)(i+48));
                occur[i]-=2;
            }

            if(occur[i] == 1 && single == -1){
                single =i;
            }
        }

        if(sb.length() ==0 && single==-1){
            System.out.println("0");
        }

        int i = sb.length()-1;
        if(single != -1){
            sb.append((char)(single+48));
        }

        for(;i>=0;i--){
            sb.append(sb.charAt(i));
        }

        System.out.println(sb);
    }
    
}
