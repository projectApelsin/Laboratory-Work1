package com.dreamsdestroyer;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введіть слово");
    String answer = scanner.nextLine();

    if (isPalindrome(answer)) {
        System.out.println(answer + " - це палідром.");
    } else {
        System.out.println(answer + " - це не палідром.");
    }
}


public static boolean isPalindrome(String word) {
    int length = word.length();


    for (int i = 0; i < length / 2; i++) {
        if (word.charAt(i) != word.charAt(length - i - 1)) {
            return false;
        }
    }
    return true;
    }
}