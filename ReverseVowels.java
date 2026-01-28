// leetcode 345

// time - o(n)
// space - o(1)

public class ReverseVowels {

    public static void main(String[] args) {
        
        String s = "IceCreAm";

        int left =0 , right = s.length()-1;

        char[] chArr = s.toCharArray();

        while(left < right){

            if(isVowel(chArr[left]) && isVowel(chArr[right])){
                swap(chArr , left++ , right--);
            }

            if(!isVowel(chArr[left])){
                left++;
            }

            if(!isVowel(chArr[right])){
                right--;
            }
        }

        System.out.println(new String(chArr));
    }

    private static boolean isVowel(char curr){

        return curr == 'A' || curr == 'a' || curr == 'E' || curr == 'e' || curr == 'I'
                || curr == 'i' || curr == 'O' || curr == 'o' || curr == 'U' || curr == 'u';
    }

    private static void swap(char[] arr , int i , int j){
        char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }
    
}
