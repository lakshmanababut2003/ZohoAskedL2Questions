// previous zoho asked type

public class DecodeWaysII {

    public static void main(String[] args) {
        
        String s = "111111111111";

        if(s.length() > 20){
            System.out.println("Too many Combinations");
            return;
        }

        System.out.println(decodeString(s , 0 , new StringBuilder()));

    }

    private static int decodeString(String s , int i , StringBuilder sb){

        if(i == s.length()){
            System.out.println(sb);
            return 1;
        }

        if(s.charAt(i) == '0'){
            return 0;
        }

        int count =0;

        int oneDigit = s.charAt(i)-'0';
        sb.append((char)('A' + oneDigit-1));
        count+=decodeString(s , i+1 , sb);
        sb.deleteCharAt(sb.length()-1);

        if(i+1 < s.length()){

            int twoDigit = (s.charAt(i)-'0') * 10 + (s.charAt(i+1)-'0');

            if(twoDigit >= 10 && twoDigit <= 26){
                sb.append((char)('A'+twoDigit-1));
                count+=decodeString(s , i+2 , sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }

        return count;
    }

  
}
