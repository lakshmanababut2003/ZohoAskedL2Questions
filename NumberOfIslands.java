// leetcode 200


public class NumberOfIslands {

    public static void main(String[] args) {
        
        char[][] mat = new char[][]{
            {'1' , '1' , '1' , '1' , '0'},
            {'1' , '1' , '0' , '1' , '0'},
            {'1' , '1' , '0' , '0' , '0' },
            {'0' , '0' , '0' ,'0' , '0'}
        };

        int ans = 0;

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                
                if(mat[i][j] == '1'){
                    ans+=1;
                dfs(mat , i , j);
                }
            }
        }


        System.out.println(ans);

    }

    private static void dfs(char[][] grid , int i , int j){

        if(i < 0 || j <0 || i>= grid.length || j >= grid[0].length || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';

        dfs(grid , i+1 , j);
        dfs(grid , i-1 , j);
        dfs(grid , i , j+1);
        dfs(grid , i , j-1);
    }
    
}
