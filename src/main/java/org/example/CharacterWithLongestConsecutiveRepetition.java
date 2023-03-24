package org.example;


/*
https://www.codewars.com/kata/586d6cefbcc21eed7a001155/train/java
or a given string s find the character c (or C) with the longest consecutive repetition and return:
Object[]{c, l};
where l (or L) is the length of the repetition. If there are two or more characters with the same l return the first in order of appearance.
For empty string return:
Object[]{"", 0}
 */

// решение подсмотрено в ответах

public class CharacterWithLongestConsecutiveRepetition {
    public static Object[] longestRepetition(String s) {
        if (s.isEmpty()) return new Object[]{"", 0};
        int max = 1, low = 1;
        char current = s.charAt(0), high = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (current == s.charAt(i)) {
                max++;
            } else {
                max = 1;
            }

            if (max > low) {
                low = max;
                high = current;
            }
            current = s.charAt(i);
        }
//        if (max > low){
//            high = current;
//            low = max;
//        }
        return new Object[]{String.valueOf(high), low};

    }
}
