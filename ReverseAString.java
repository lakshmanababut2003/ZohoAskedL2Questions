// leetcode 151
// Time Complexity:
// O(n)

// Space Complexity:
// O(1) (excluding output string)


public class ReverseAString {

    public static void main(String[] args) {
        
        String s = "the sky is blue";

        char[] a = s.toCharArray();
        int n = a.length;

        reverse(a , 0 , n-1);
        reverseWord(a , n);
        System.out.println(cleanSpaces(a , n));

        
    }

    private static void reverse(char[] a, int i , int j){

        while(i < j){
            char temp = a[i];
            a[i++] = a[j];
            a[j--] = temp;
        }
    }

    private static void reverseWord(char[] a , int n){

        int i=0 , j=0;

        while(i < n){

            while(i < j || i < n && a[i] == ' '){
                i++;
            }

            while(j < i || j < n && a[j] != ' '){
                j++;
            }

        reverse(a , i , j-1);

        }

    }

     
    private static String cleanSpaces(char[] a , int n){

        int i =0 , j=0;

        while(j < n){

            while(j < n && a[j] == ' '){
                j++;
            }

            while(j < n && a[j] != ' '){
                a[i++] = a[j++];
            }

            while(j < n && a[j] == ' '){
                j++;
            }

            if(j < n){
                a[i++] = ' ';
            }
        }

        return new String(a).substring(0 , i);
    }
    
}
