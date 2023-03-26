package org.example.kyu6;

/*
https://www.codewars.com/kata/5938f5b606c3033f4700015a/java
Introduction
There is a war...between alphabets!
There are two groups of hostile letters. The tension between left side letters and right side letters was too high and the war began.
The letters called airstrike to help them in war - dashes and dots are spread throughout the battlefield. Who will win?
Task
Write a function that accepts a fight string which consists of only small letters and * which represents a bomb drop place.
Return who wins the fight after bombs are exploded. When the left side wins return Left side wins!,
and when the right side wins return Right side wins!. In other cases, return Let's fight again!.

The left side letters and their power:
 */
public class AlphabetWarAirstrike {
    public static String alphabetWar(String fight) {
        int left = 0, right = 0;
        char[] chars = fight.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = fight.charAt(i);
            if (Character.valueOf(c).equals('*')) {
                chars[i] = '_';
                if (i - 1 >= 0) chars[i - 1] = '_';
                if (i + 1 < chars.length) chars[i + 1] = '_';
            }
            // подсмотрено
            // char[] alphabet = fight.replaceAll("\\w?\\*\\w?","").toCharArray();

        }
        for (char c : chars) {
            switch (c) {
                case 'w' -> left += 4;
                case 'p' -> left += 3;
                case 'b' -> left += 2;
                case 's' -> left += 1;
                case 'm' -> right += 4;
                case 'q' -> right += 3;
                case 'd' -> right += 2;
                case 'z' -> right += 1;
            }
        }
        if (left == right) return "Let's fight again!";
        return (left > right ? "Left" : "Right") + " side wins!";
    }
}
