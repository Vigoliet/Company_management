package org.example;

public class Utilities {

    public static boolean isOdd(int number){
        return number % 2 != 0;
    }

    public static boolean stringIsBlank(String input){
        return input == null || input.trim().isEmpty();
    }

    public static Level getNoiseLevel(int decibel){
        if (decibel <= 30){
            return Level.LOW;
        } else if (decibel >= 70) {
            return Level.HIGH;
        } else {
            return Level.MEDIUM;
        }
    }

    public static String makeStringLowerCase(String input){
        return input.toLowerCase();
    }

}
