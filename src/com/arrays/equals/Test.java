package com.arrays.equals;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[][] rows1 = { new String[] { "a", "a" } };

        String[][] rows2 = { new String[] { "a", "a" } };
        
        String[][] rows3 = {{"a","a"}, {"b","b"}};
        
        String[][] rows4 = rows3;
        
        String[] strArray={"a","b","c"};
        Integer[] intArray={1,2,3};
        
        Object[] objArray = new Object[strArray.length + intArray.length];
        
        objArray = ArrayUtils.addAll(strArray, intArray);
        

        System.out.println("Arrays.equals() = " + Arrays.equals(rows1, rows2));
        System.out.println("Arrays.equals() = " + Arrays.equals(rows3, rows4));
        

    }
}
