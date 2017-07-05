package com.string.problems;

import java.util.HashMap;
import java.util.Map;

/*
 * How to check if two Strings are anagrams of each other? 
 * */

public class CheckIfAnagrams {

    public static void main(String args[]) {
        System.out.println(checkIfAnagram("Army", "Mary"));
        System.out.println(checkIfAnagram("Check", "true"));
        System.out.println(checkIfAnagram("AAbbcc", "cAAbbc"));
        System.out.println(checkIfAnagram("", null));
    }

    public static boolean checkIfAnagram(String strOne, String strTwo) {
        if (strOne == null || strTwo == null) {
            return false;
        }
        strOne = strOne.toLowerCase();
        strTwo = strTwo.toLowerCase();

        strOne = strOne.trim();
        strTwo = strTwo.trim();

        if (strOne.equals(strTwo)) {
            return true;
        }

        boolean anagram = false;

        Map<Character, Integer> strOneMap = createCountMap(strOne);
        Map<Character, Integer> strTwoMap = createCountMap(strTwo);

        if (strOneMap.equals(strTwoMap)) {
            anagram = true;
        }

        return anagram;
    }

    public static Map<Character, Integer> createCountMap(String str) {

        Map<Character, Integer> strCountMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            Character key = str.charAt(i);
            if (strCountMap.containsKey(key)) {
                int count = strCountMap.get(key);
                count = count + 1;
                strCountMap.put(key, count);
            } else {
                strCountMap.put(key, 1);
            }
        }

        return strCountMap;
    }
}
