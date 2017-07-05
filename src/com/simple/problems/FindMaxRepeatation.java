package com.simple.problems;

import java.util.HashMap;
import java.util.Map;

public class FindMaxRepeatation {

    public static void main(String[] args) {
        String arr[] = { "lot", "lot", "of", "repeatations", "again", "and", "again" };

        Map<String, Integer> frequency = new HashMap<String, Integer>();

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (frequency.get(arr[i]) == null) {
                frequency.put(arr[i], count);
            } else {
                count = frequency.get(arr[i]);
                count = count + 1;
                frequency.put(arr[i], count);
            }
        }

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println("Word:" + entry.getKey() + " " + "Frequency:" + entry.getValue() + " ");
        }

    }

}
