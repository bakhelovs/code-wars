package org.example;

/*
https://www.codewars.com/kata/6411b91a5e71b915d237332d/train/java
Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid.
The function should return true if the string is valid, and false if it's invalid.
"()"              =>  true
")(()))"          =>  false
"("               =>  false
"(())((()())())"  =>  true
 */

public class ValidParentheses {
    public static boolean validParentheses(String parenStr) {
        int open = 0, close = 0, opened = 0;

        if (parenStr.isEmpty()) return true;
        if (parenStr.length() % 2 != 0) return false;

        char[] chars = parenStr.toCharArray();
        if (chars[0]==')') return false;

        for (Character c : chars) {
            if (opened < 0) return false;
            if (c.equals('(')) {
                open++;
                opened++;
            } else if (c.equals(')')) {
                close++;
                opened--;
            }
        }
        if (opened != 0) return false;
        return open == close;
    }
}
