// leetcode 38
// O(n × L)
// Space Complexity:
// O(L)
// (where L = length of the generated string at each step)

public class CountAndSay {

    public static void main(String[] args) {
        
        int n = 4;

        String s = "1";
            System.out.println(s);

        for(int i=1;i<n;i++){
            s=generatePattern(s);
            System.out.println(s);

        }



    }

    private static String generatePattern(String s){

        int count =1;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            if(i+1 < s.length() && s.charAt(i) == s.charAt(i+1)){
                count++;
                continue;
            }

            sb.append(count).append(s.charAt(i));
            count=1;
        }

        return sb.toString();
    }
    
}
