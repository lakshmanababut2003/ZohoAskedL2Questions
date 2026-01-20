// leetcode 1328

public class BreakAPalindrome {

    public static void main(String[] args) {
        
        String s = "abbcbba";

        char[] arr = s.toCharArray();

        for(int i=0;i<arr.length/2;i++){

            if(arr[i] != 'a'){
                arr[i] = 'a';
                System.out.println(new String(arr));
                return;
            }
        }

        arr[arr.length-1] = 'b';
        System.out.println(new String(arr));
    }
    
}
