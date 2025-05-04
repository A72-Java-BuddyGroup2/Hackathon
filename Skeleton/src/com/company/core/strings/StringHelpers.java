package com.company.core.strings;

@SuppressWarnings("StringConcatenationInLoop")
public class StringHelpers {

    public static String abbreviate(String source, int maxLength) {
        return null;
    }

    public static String capitalize(String source) {
        return null;
    }

    public static String concat(String string1, String string2) {
        return null;
    }

    public static boolean contains(String source, char symbol) {
        return false;
    }

    public static boolean endsWith(String source, char target) {
        return false;
    }

    public static int firstIndexOf(String source, char target) {
        return 0;
    }

    public static int lastIndexOf(String source, char symbol) {
        return 0;
    }

    public static String pad(String source, int length, char paddingSymbol) {
        String temp= "";
        int charsAmount = (length - source.length()) / 2;
        for (int i = 0; i < charsAmount; i++) {
            temp += paddingSymbol;
        }
        temp += source;
        for (int i = 0; i < charsAmount; i++) {
            temp += paddingSymbol;
        }
        return temp;
    }

    public static String padEnd(String source, int length, char paddingSymbol) {
        return null;
    }

    public static String padStart(String source, int length, char paddingSymbol) {
        return null;
    }

    public static String repeat(String source, int times) {
        return null;
    }

    public static String reverse(String source) {
        return null;
    }

    public static String section(String source, int start, int end) {
        return source.substring(start,end + 1);
    }

    public static boolean startsWith(String source, char target) {
        return source.startsWith("" + target);
    }

}
