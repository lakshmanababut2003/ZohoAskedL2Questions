// leetcode 212

import java.util.*;

public class WordSearchII {

    public static void main(String[] args) {

        char[][] board = new char[][]{
            {'o' , 'a' , 'a' , 'n'},
            {'e' , 't' , 'a' , 'e'},
            {'i' , 'h' , 'k' , 'r' },
            {'i' , 'f' , 'l' , 'v'}
        };

        String[] words = new String[]{
            "oath" , "pea" , "eat" , "rain"
        };


        Trie trie = new Trie();

        for(String word : words){
            trie.add(word);
        }

        List<String> ans = new ArrayList<>();

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                dfs(board , i , j , ans , trie , trie);
            }
        }
        
        System.out.println(ans);
    }

    private static void dfs(char[][] b , int i , int j , List<String> ans , Trie curr , Trie root){

        char c = b[i][j];

        if(c == '-' || curr.next[c-'a'] == null || curr.next[c-'a'].passCount == 0){
            return ;
        }

        b[i][j] = '-';
        Trie nextNode = curr.next[c-'a'];

        if(nextNode.word != null){
            ans.add(nextNode.word);
            root.remove(nextNode.word);
        }

        if(i > 0 ){
            dfs(b , i-1 , j , ans , nextNode , root);
        }

        if(i +1 < b.length){
            dfs(b , i+1 , j , ans , nextNode , root);
        }

        if(j > 0){
            dfs(b , i , j-1 ,ans , nextNode , root);
        }

        if(j+1 < b[0].length){
            dfs(b , i , j+1 , ans , nextNode , root);
        }

        b[i][j] = c;
    }
    
}

class Trie{

    Trie[] next ;
    String word ;
    int passCount;

    public Trie(){
        next = new Trie[26];
        word = null;
        passCount = 0;
    }

    public void add(String w){

        Trie curr = this;

        for(char c : w.toCharArray()){

            if(curr.next[c-'a'] == null){
                curr.next[c-'a'] = new Trie();
            }

            curr = curr.next[c-'a'];
            curr.passCount++;
        }

        curr.word = w;
    }

    public void remove(String w){

        Trie curr = this;

        for(char c : w.toCharArray()){
            curr = curr.next[c-'a'];
            curr.passCount--;
        }

        curr.word = null;
    }
}
