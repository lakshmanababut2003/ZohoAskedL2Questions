// leetcode 12
// time - o(n)
// space - o(1)

public class IntRomanI {

    public static void main(String[] args) {
        
        int num = 3749;


        int[] key = new int[] {1000 , 900 , 500 , 400 , 100 , 90 , 50 , 40 , 10 , 9 , 5 , 4 , 1};
        String[] val = new String[] {"M" , "CM" , "D" , "CD" , "C" , "XC" , "L" , "XL" , "X" , "IX" , "V" , "IV" , "I"};

        StringBuilder sb = new StringBuilder();


        for(int i=0;i<key.length;i++){

            int roman = num / key[i];

            while(roman-- != 0){
                sb.append(val[i]);
            }

            num = num % key[i];
        }

        System.out.println(sb);
    }
    
}
