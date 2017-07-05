package com.simple.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringPermutation {

    public static void main(String args[]) {
        String perm = "Abcd";

        System.out.println(permutation("", perm));
    }

    public static String permutation(String prefix, String perm) {
        if (perm.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < perm.length(); i++) {
                permutation(prefix + perm.charAt(i), perm.substring(0, i) + perm.substring(i + 1));
            }
        }
        return prefix;
    }

    public static String permutation2(String prefix, String perm) {

        if (perm.length() == 0) {
            System.out.println(prefix);
            return prefix;
        } else {
            for (int i = 0; i < perm.length(); i++) {
                permutation2(prefix + perm.charAt(i), perm.substring(0, i) + perm.substring(i + 1, perm.length() - 1));
            }

        }

        return prefix;
    }

    public String inputChecker(List<String> input) {

        List<String> arrString = Arrays.asList("A", "B", "C");
        Set<String> noDups = new HashSet<>(input);
        for (String s : noDups) {
            if (input.indexOf("A") > 0 || arrString.indexOf("B") > 0 || arrString.indexOf("B") > 0) {
                return s;
            }
        }

        return "Invalid Input";
    }

}
