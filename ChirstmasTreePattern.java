// previous zoho asked question

// input s = "EXAPMLE" -> prints the zigzag like chrismas tree

public class ChirstmasTreePattern {

    public static void main(String[] args) {
        
        String s = "ANBU";

        int len = s.length();

        int mid = len / 2;

        int left = mid-1;
        int right = mid;

        if(len % 2 != 0){

            right = mid+1;
            System.out.println(" ".repeat(mid) + s.charAt(mid));
        }

        int row =0;
        while(left >= 0 && right < len){

            char first , second ;

            if(row % 2 == 0){

                first = s.charAt(left);
                second = s.charAt(right);
            }
            else{
                first = s.charAt(right);
                second = s.charAt(left);
            }

            System.out.print(" ".repeat(left) + first);
            System.out.print(" ".repeat(right -left -1) + second);
            System.out.println();
            left--;
            right++;
            row++;
        }
    }
    
}
