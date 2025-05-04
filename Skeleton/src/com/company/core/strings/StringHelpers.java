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

    /**
     * Adds <code>paddingSymbol</code> char to the start and end of a string <code>target</code> until desired
     * <code>length</code> is achieved.
     *
     * @param source The base String
     * @param length The desired length
     * @param paddingSymbol The symbol to use for padding
     * @return The resulting array in format ---Test---
     *
     * @author Kristiyan Tanchev
     */
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

    /**
     * Get a portion of the provided<code>String</code> starting from <code>int</code> index and ending at
     * <code>int</code> index inclusive
     *
     * @param source The base String
     * @param start The index of the first char to be included
     * @param end The index of the last char to be included
     * @return The resulting substring
     *
     * @author Kristiyan Tanchev
     */
    public static String section(String source, int start, int end) {
        return source.substring(start,end + 1);
    }

    /**
     * Checks if a <code>String</code> is starting with a given char <code>target</code>
     *
     * @param source The base String
     * @param target The char for checking
     * @return true if the String source starts with char target; false otherwise
     *
     * @author Kristiyan Tanchev
     */
    public static boolean startsWith(String source, char target) {
        return source.startsWith("" + target);
    }

}
