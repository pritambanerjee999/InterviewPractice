package com.string.problems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//How to program to print first non repeated character from String?


public class PrintFirstNonRepeatingCharacter {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        firstNonRepeatingCharacter("abaabcdddeaa");

    }
    
    public static void firstNonRepeatingCharacter(String str){
        
        if(null == str){
            return;
        }
        
        if("".equals(str)){
            return;
        }
        
        
        Map<Character, Integer> map = createLinkedHashMap(str);
        
        for(Character c: map.keySet()){
            int count = map.get(c);
            if(count == 1){
                System.out.println(c);
                return;
            }
        }
        
    }
    
    public static Map<Character, Integer> createLinkedHashMap(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();
        
        for(int i = 0; i < str.length(); i++){
            Character key = str.charAt(i);
            if(map.containsKey(key)){
                int count = map.get(key);
                count = count + 1;
                map.put(key, count);
            }else{
                map.put(key, 1);
            }
            
        }
        return map;
    }

}
