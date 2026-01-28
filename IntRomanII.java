// leetcode 13

public class IntRomanII {

    public static void main(String[] args) {
        
        String s = "MCMXCIV";

        int ans = 0 , num =0;

        for(int i=s.length()-1;i>=0;i--){

            char curr = s.charAt(i);
            switch(curr){
                case 'I':{
                    num = 1;
                    break;
                }
                case 'V':{
                    num = 5;
                    break;
                }
                case 'X':{
                    num = 10;
                    break;
                }
                case 'L':{
                    num = 50;
                    break;
                }
                case 'C':{
                    num = 100;
                    break;
                }
                case 'D':{
                    num = 500;
                    break;
                }
                case 'M':{
                    num = 1000;
                    break;
                }
            }

             if(4*num < ans){
                    ans-=num;
                }
                else{
                    ans+=num;
                }
        }

        System.out.println(ans);
    }
    
}
