package org.example;

/*
https://www.codewars.com/kata/59377c53e66267c8f6000027/java
Introduction
There is a war and nobody knows - the alphabet war!
There are two groups of hostile letters. The tension between left side letters and right side letters was too high and the war began.
Task
Write a function that accepts fight string consists of only small letters and return who wins the fight.
When the left side wins return Left side wins!, when the right side wins return Right side wins!, in other case return Let's fight again!.

The left side letters and their power:
 w - 4 p - 3 b - 2 s - 1
 The right side letters and their power:
 m - 4 q - 3 d - 2 z - 1
 */

import java.util.HashMap;
import java.util.Map;

public class AlphabetWar {
    public static String alphabetWar(String fight) {
        int countLeftSide = 0, countRightSide = 0;
        Map<Character, Integer> mapLeft = new HashMap<>();
        mapLeft.put('w', 4);
        mapLeft.put('p', 3);
        mapLeft.put('b', 2);
        mapLeft.put('s', 1);
        Map<Character, Integer> mapRight = new HashMap<>();
        mapRight.put('m', 4);
        mapRight.put('q', 3);
        mapRight.put('d', 2);
        mapRight.put('z', 1);

        for (char c : fight.toCharArray()) {
            for (char m : mapLeft.keySet()) {
                if (Character.valueOf(c).equals(m)) countLeftSide += mapLeft.get(m);
            }
            for (char g : mapRight.keySet()) {
                if (Character.valueOf(c).equals(g)) countRightSide += mapRight.get(g);
            }
        }
        if (countLeftSide > countRightSide) {
            return "Left side wins!";
        } else if (countRightSide > countLeftSide) {
            return "Right side wins!";
        } else return "Let's fight again!";

    }
    /*
    подсмотрено
    for (char c : fight.toCharArray()) {
        switch (c) {
          case 'w' : left += 4; break;
          case 'p' : left += 3; break;
          case 'b' : left += 2; break;
          case 's' : left += 1; break;

          case 'm' : right += 4; break;
          case 'q' : right += 3; break;
          case 'd' : right += 2; break;
          case 'z' : right += 1; break;
        }
      }
      if (left == right) return "Let's fight again!";
      return (left > right ? "Left" : "Right") + " side wins!";
     */
}
