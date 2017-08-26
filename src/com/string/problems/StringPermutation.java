package com.string.problems;

/*
 * How to find all permutations of String?
 * */

public class StringPermutation {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String testString = "abcd";
        System.out.println(permutation("",testString));        
    }

    public static String permutation(String prefix, String perm) {     //""   test
        if (perm.length() == 0) {                                      //
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
