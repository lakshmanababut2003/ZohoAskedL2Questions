// leetcode 392

// time - o(n)
// space - o(1)

public class IsSubSeq {

    public static void main(String[] args) {
        
        String s = "abc";
        String t = "ahbxc";

        int sp =0 , tp=0;

        while(sp < s.length() && tp < t.length()){

            if(s.charAt(sp) == t.charAt(tp)){
                sp++;
            }

            tp++;
        }

        System.out.println(sp == s.length());
    }
    
}
