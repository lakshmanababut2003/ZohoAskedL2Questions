// zoho previous question

public class CricketScore {

    public static void main(String[] args) {
        
        String timeLine = "1.2.436W 1.N.21";

        calculateScore(timeLine);
    }

    private static void calculateScore(String timeLine){

        int player1 = 0, player2 = 0;
        int extras = 0 ,  ballCount = 1;
        
        String strike = "p1";

        for(char c : timeLine.toCharArray()){

            if(Character.isDigit(c)){

                if(strike.equals("p1")){
                    player1 += c-'0';

                    if((c-'0') % 2 != 0){
                        strike = "p2";
                    }
                }
                else{
                    player2 += c- '0';
                     if((c-'0') % 2 != 0){
                        strike = "p1";
                    }
                }
            }
            else if(c == 'W' || c == 'N'){
                extras++;
                continue;
            }

            ballCount++;

              if(ballCount % 6 == 0){
                strike = strike.equals("p1") ? "p1" : "p2";
            }
        }

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(extras);
    }
    
}
