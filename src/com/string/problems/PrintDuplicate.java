package com.string.problems;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicate {

    public static void main(String[] args) {
        System.out.println(printDuplicate("aabbbccddefghiii"));
        System.out.println(printDuplicate("iiii"));
        System.out.println(printDuplicate(""));
        System.out.println(printDuplicate(null));
        System.out.println(printDuplicate("abc"));
    }

    public static String printDuplicate(String str) {

        if (null == str) {
            return "";
        }

        if ("".equals(str)) {
            return str;
        }

        if (str.length() == 2) {
            if (str.charAt(0) == str.charAt(1)) {
                return str.substring(0);
            } else {
                return str;
            }
        }

        Map<Character, Integer> strCount = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (!strCount.containsKey(ch)) {
                strCount.put(ch, 1);
            } else {
                Integer count = strCount.get(ch);
                count = count + 1;
                strCount.put(ch, count);
            }
        }

        for (Character key : strCount.keySet()) {
            Integer count = strCount.get(key);
            if (count > 1) {
                sb.append(key);
            }
        }

        return sb.toString();
    }

}
