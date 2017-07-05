package com.simple.problems;


import java.util.Stack;

public class ParanthesisBalancing {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String abc = "(())(())(())))";
        String abc2 = "(()))()(())";

        System.out.println(printthebalancedexp(abc2));
    }

    public static String printthebalancedexp(String test) {

        if (null == test) {
            return "";
        }
        
        String result = "";
        boolean index[] = new boolean[test.length()];

        // boolean balanced = true

        if (test.length() == 0 || test.length() == 1) {
            return test;
        }

        Stack<Character> charStack = new Stack<>();
        Stack<Integer> intOpenStack = new Stack<>();

        boolean balanced = true;

        for (int i = 0; i < test.length(); i++) {
            if ('(' == test.charAt(i)) {
                charStack.push('(');
                intOpenStack.push(i);
            } else if (')' == test.charAt(i)) {
                // System.out.println(")" + i);
                if (!charStack.empty()) {
                    if (charStack.pop() == '(') {
                        index[intOpenStack.pop()] = true;
                        index[i] = true;
                    }
                    
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index.length; i++) {
            if (index[i]) {
                sb.append(test.charAt(i));
            }
        }
        result = sb.toString();
        return result;

    }

}
