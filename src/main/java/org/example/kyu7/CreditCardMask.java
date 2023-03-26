package org.example.kyu7;

/*
https://www.codewars.com/kata/5412509bd436bd33920011bc/java
Usually when you buy something, you're asked whether your credit card number,
phone number or answer to your most secret question is still correct.
However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.
Your task is to write a function maskify, which changes all but the last four characters into '#'.
 */

public class CreditCardMask {
    public static String maskify(String str) {
        if (str.length() < 4) return str;
        else return str.substring(0, str.length() - 4).replaceAll("\\p{all}", "#") + str.substring(str.length() - 4);

        // подсмотрено return str.replaceAll(".(?=.{4})", "#");
    }
}
