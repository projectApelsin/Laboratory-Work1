package com.dreamsdestroyer;

public class Main {
public static void main(String[] args) {
    String word = "lev";

    if (isPalindrome(word)) {
        System.out.println(word + " - это палиндром.");
    } else {
        System.out.println(word + " - это не палиндром.");
    }
}


public static boolean isPalindrome(String word) {
    int length = word.length();


    for (int i = 0; i < length / 2; i++) {

        if (word.charAt(i) == word.charAt(i)) {
        } else {
            return false;
        }
    }
    return true;
}
}
