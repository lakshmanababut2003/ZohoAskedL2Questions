// Leetcode - 49

import java.util.*;

public class GroupAnagram{

    public static void main(String[] args){

        String[] arr = new String[] {"eat","tea","tan","ate","nat","bat"};

       HashMap<String , List<String>> map = new HashMap<>();

       for(String s : arr){

        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        String newString = new String(temp);

        if(map.containsKey(newString)){
            map.get(newString).add(s);
        }
        else{
            map.put(newString , new ArrayList<>());
            map.get(newString).add(s);
        }
       }

       System.out.println(map);

    }
}