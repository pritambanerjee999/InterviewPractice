package com.interview.difference;

import java.util.HashSet;
import java.util.Set;

public class RemoveCharacters {

    public static void main(String[] args) {
        String testOne = "Remove Duplicate Characters";
        System.out.println(removeDuplicateCharacters(testOne));
    }

    public static String removeDuplicateCharacters(String str) {

        Set<Character> strUnique = calculateUniqueCharacters(str);

        return strUnique.toString();
    }

    public static Set<Character> calculateUniqueCharacters(String str) {
        Set<Character> uniqueCharacterSet = new HashSet<>();
        str = str.toLowerCase();
        str = str.replaceAll("\\s+", "");
        for (int i = 0; i < str.length(); i++) {
            uniqueCharacterSet.add(str.charAt(i));
        }
        return uniqueCharacterSet;
    }
}
