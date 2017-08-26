package com.careercup.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class IndexOfWordsInASentence {
    
    public static void main(String args[]){
        String str = "Trying to find all the position index  of each and every and all word";
        Map <String, ArrayList<Integer>> indexMap = new HashMap<>();
        
        indexMap = findIndexOfWords(str);
    }
    
    public static Map <String, ArrayList<Integer>> findIndexOfWords(String str){
        List<String> strList = new ArrayList<>(Arrays.asList(str.split("\\s+")));
        Map <String, ArrayList<Integer>> indexMap = new HashMap<>();
        
        for(String s: strList){
            if(indexMap.containsKey(s)){
                
                int index = str.indexOf(s);
                
            }else{
                indexMap.put(s, new ArrayList(Arrays.asList(str.indexOf(s))));
            }
        }
        
        return indexMap;
    }

}
