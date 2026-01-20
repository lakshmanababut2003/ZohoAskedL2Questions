// leetcode 22
// Time Complexity: O(Cₙ · n)
// Space Complexity: O(n)

// (where Cₙ is the nᵗʰ Catalan number)

import java.util.*;

public class GenerateParthesh {

    public static void main(String[] args) {
        
      int n = 3;

     List<String> ans = new ArrayList<>();

     dfs(n , 0 , 0 , "" , ans);

     System.out.println(ans);
    }

    private static void dfs(int n , int openP , int closeP , String s, List<String> ans ){

        if(openP == closeP && openP + closeP == 2*n){
            ans.add(s);
            return;
        }

        if(openP < n){
            dfs(n , openP+1 , closeP , s+"(" , ans);
        }

        if(closeP < openP){
            dfs(n , openP , closeP+1 , s+")" , ans);
        }
    }


 
}
