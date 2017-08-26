package com.collections.map.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {

    public static void main(String args[]) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("One", 1);

        map.put("Three", 3);

        map.put("Two", 2);

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("a");
        arr.add("b");
        arr.add("c");

        iterateUsingEntrySet(map);
        iterateUsingLambda(map);
        iterateUsingIteratorAndEntry(map);
        iterateUsingKeySetAndForeach(map);
        iterateUsingStreamAPI(map);

    }

    public static void iterateUsingEntrySet(Map<String, Integer> map) {
        System.out.println("Using Entry Set");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }

    public static void iterateUsingLambda(Map<String, Integer> map) {
        System.out.println("Using Lambda Expression");
        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }

    public static void iterateUsingIteratorAndEntry(Map<String, Integer> map) {

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        System.out.println("Using Iterator and Map Entry");
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            System.out.println(pair.getKey() + ":" + pair.getValue());
        }

    }

    public static void iterateUsingKeySetAndForeach(Map<String, Integer> map) {
        System.out.println("Using KeySet and for each");
        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }

    }

    public static void iterateUsingStreamAPI(Map<String, Integer> map) {
        System.out.println("Using Stream API");
        map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
    }

    public static void iterateKeys(Map<String, Integer> map) {
        System.out.println("Iterating Keys");
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }

    public static void keySetIteration(Map<String, Integer> map) {
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }

}