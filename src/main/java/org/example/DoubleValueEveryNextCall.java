package org.example;

/*
https://www.codewars.com/kata/632408defa1507004aa4f2b5/java

This kata is about static method that should return different values.

On the first call it must be 1, on the second and others - it must be a double from previous value.

Look tests for more examples, good luck :)
 */

public class DoubleValueEveryNextCall {
    static int calls = 0;

    public static int getNumber() {
        if (calls == 0) {
            calls++;
            return calls;
        } else {
            int n = calls * 2;
            calls *= 2;
            return n;
        }
    }
}
