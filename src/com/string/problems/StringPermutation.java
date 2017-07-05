package com.string.problems;

import java.util.HashSet;
import java.util.Set;

/*
 * How to find all permutations of String?
 * */

public class StringPermutation {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String testString = "abcd";
        System.out.println(permutation("",testString));
        
        Set<Character> charSet = new HashSet<>();
        
        for(int i = 0; i < testString.length(); i++){
            charSet.add(testString.charAt(i));
        }
    }

    public static String permutation(String prefix, String perm) {
        if (perm.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < perm.length(); i++) {
                String returnPrefix = prefix + perm.charAt(i);
                String returnPerm = perm.substring(0, i) + perm.substring(i + 1);
                permutation(returnPrefix, returnPerm);
            }
        }
        
        return prefix;
    }

}
