// Leetcode 242

// time - o(n)
// space - o(26)

public class ValidAnagram {

    public static void main(String[] args) {
        
        String s1 = "anagram";
        String s2 = "nagaran";

        int[] arr = new int[26];

        if(s1.length() != s2.length()){
            System.out.println(false);
            return;
        }

        for(int i=0;i<s1.length();i++){

            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
    
}
