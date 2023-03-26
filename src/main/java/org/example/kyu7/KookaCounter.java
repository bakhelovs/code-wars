package org.example.kyu7;

/*
https://www.codewars.com/kata/58e8cad9fd89ea0c6c000258/java
Hint
The trick to counting kookaburras is to listen carefully
The males sound like HaHaHa...
The females sound like hahaha...
And they always alternate male/female
Examples
ha = female => 1
Ha = male => 1
Haha = male + female => 2
haHa = female + male => 2
hahahahaha = female => 1
hahahahahaHaHaHa = female + male => 2
HaHaHahahaHaHa = male + female + male => 3
 */

public class KookaCounter {
    static int count = 0;
    static int index = 0;

    public static int kookaCounter(final String laughing) {
        if (laughing.startsWith("ha")) {
            count++;
            indexOfMale(laughing, 2);
        } else if (laughing.startsWith("Ha")) {
            count++;
            indexOfFemale(laughing, 2);
        } else return 0;

        int answer = count;
        count = 0;
        return answer;
    }

    public static void indexOfMale(String str, int indexOf) {
        if (str.indexOf("Ha", indexOf) > indexOf) {
            count++;
            index = str.indexOf("Ha", indexOf);
            indexOfFemale(str, index);
        }
    }

    public static void indexOfFemale(String str, int indexOf) {
        if (str.indexOf("ha", indexOf) > indexOf) {
            count++;
            index = str.indexOf("ha", indexOf);
            indexOfMale(str, index);
        }
    }
}
