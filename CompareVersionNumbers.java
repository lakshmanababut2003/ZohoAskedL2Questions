// leetcode 165

// time - O(max(v1.length() , v2.length()))
// space - o(1)

public class CompareVersionNumbers {

    public static void main(String[] args) {
        
        String v1 = "1.2";
        String v2 = "1.10";

        int v1Len = v1.length();
        int v2Len = v2.length();

        int ind1=0 , ind2=0;

        while(ind1 < v1Len || ind2 < v2Len){

            int rev1=0;

            while(ind1 < v1Len && v1.charAt(ind1) != '.'){

                rev1=10*rev1 + (v1.charAt(ind1) - '0');
                ind1++;
            }

            int rev2=0;

            while(ind2<v2Len && v2.charAt(ind2) != '.'){
                rev2 = 10*rev2+(v2.charAt(ind2) - '0');
                ind2++;
            }

            if(rev1 != rev2){

                if(rev1 < rev2){
                    System.out.println(-1);
                    return;
                }

                if(rev1 > rev2){
                    System.out.println(1);
                    return;
                }
            }

            ind1++;
            ind2++;
        }

        System.out.println(0);
    }
    
}
