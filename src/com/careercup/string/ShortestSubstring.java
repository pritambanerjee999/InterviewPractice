package com.careercup.string;
/*
 * Given an input string "aabbccba", find the shortest substring from the alphabet "abc". 
 * In the above example, there are these substrings "aabbc", "aabbcc", "ccba" and "cba". However the shortest substring that contains all the characters in the alphabet is "cba", so "cba" must be the output. 
 * Output doesnt need to maintain the ordering as in the alphabet. 
 * Other examples: 
 * input = "abbcac", alphabet="abc" Output : shortest substring = "bca".
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShortestSubstring {

    public static void main(String[] args) {
        String str = "aabbccba";
        System.out.println(findShortestSubstring(str));
    }
    
    public static String findShortestSubstring(String str){
        if(null == str){
            return "";
        }
        
        if(str.length() == 1){
            return str;
        }
        
        Set<Character> characterSet = findUniqueCharacters(str);
        String shortestSubString = "";
        int minimum = Integer.MAX_VALUE;
        
        List<String> subString = new ArrayList<>();
        subString = findAllSubString(str);
          
        for(String s: subString){
            Set<Character> subStringSetOfCharacters = findUniqueCharacters(s);
            if(subStringSetOfCharacters.equals(characterSet)){
                if(minimum > s.length()){
                    shortestSubString = s;
                    minimum = s.length();
                }
            }
            
        }
        
        return shortestSubString;
    }
    
    
    public static Set<Character> findUniqueCharacters(String str){
        Set<Character> setOfCharacter = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            setOfCharacter.add(str.charAt(i));
        }
      //  System.out.println(setOfCharacter.toString());
        return setOfCharacter;
    }
    
    public static List<String> findAllSubString(String str){
        List<String> subStringList = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            for(int j = i+1; j<=str.length(); j++){
                subStringList.add(str.substring(i,j));
              //  System.out.println(str.substring(i,j));
            }
        }
        
        return subStringList; 
    }

}
