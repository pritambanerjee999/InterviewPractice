package com.string.problems;

public class ReverseTheWordsOfSentence {

    public static void main(String[] args) {
        System.out.println(reverseSentence("I am the king"));
        System.out.println(reverseSentence("testing"));
        System.out.println(reverseSentence(""));
        System.out.println(reverseSentence("No Way"));
    }
    
    public static String reverseSentence(String str){
        
        if(null == str){
            return "";
        }
        
        if("".equals(str)){
            return "";
        }
        
        StringBuilder reverseStringBuilder = new StringBuilder();
        
        String words[] = str.split("\\s+");
        
        for(int i = words.length - 1; i > -1; i--){
            reverseStringBuilder.append(words[i]);
            reverseStringBuilder.append(" ");
        }
        
        return reverseStringBuilder.toString();
    }

}
