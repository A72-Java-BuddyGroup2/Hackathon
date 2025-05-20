package com.company.core.strings;

@SuppressWarnings("StringConcatenationInLoop")
public class StringHelpers {

    /**
     * Abbreviates a string using ellipses.
     * @param source String - the string to modify
     * @param maxLength int - Maximum length of the resulting string
     * @return String - the abbreviated string
     *
     * @author Vasil Shopov
     */
    public static String abbreviate(String source, int maxLength) {
        if (maxLength >= source.length()) {
            return source;
        }

        return source.substring(0, maxLength) + "...";
    }

    /**
     * Capitalize the first letter of the source.
     * @param source String - A input string that needs it's first letter capitalized.
     *               If the first letter starts with a lowercase letter, it will be converted to uppercase.
     *               If it's already uppercase or not a letter, it remains unchanged.
     *               If the input is null or empty, it is return as-is.
     * @return String - A new string with the first character capitalized and the rest unchanged.
     *               Return the original input if it's null or empty.
     * @author Todor Krushkov
     */
    public static String capitalize(String source) {
        if (source == null || source.isEmpty()) {
            return source;
        }

        char firstChar = source.charAt(0);
        char capitalizedFirst;

        if (firstChar >= 'a' && firstChar <= 'z') {
            capitalizedFirst = (char) (firstChar - ('a' - 'A'));
        } else {
            capitalizedFirst = firstChar;
        }

        String result = "" + capitalizedFirst;

        for (int i = 1; i < source.length(); i++) {
            result += source.charAt(i);
        }

        return result;
    }

    /**
     * Concatenates two String objects into one.
     *
     * @param string1 The first String
     * @param string2 The second String
     * @return A new String that is the concatenation of string1 and string2;
     * returns null if both inputs are null
     * @author Yordan Paskalev
     */
    public static String concat(String string1, String string2) {
        if (string1 == null && string2 == null) {
            return null;
        } else if (string1 == null) {
            return string2;
        } else if (string2 == null) {
            return string1;
        }

        return string1 + string2;
    }

    /**
     * Checks if source contains a symbol.
     * @param source String - The string that gets checked
     * @param symbol char - The character that's checked for
     * @return boolean - 'true' if source contains the checked for symbol, otherwise 'false'.
     *
     * @author Vasil Shopov
     */
    public static boolean contains(String source, char symbol) {
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == symbol) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if the target is the last character of the source
     * @param source String - The string to check if it is empty and if the target is it's last index.
     * @param target char - The character check if it is the last index of the source.
     * @return boolean - returns 'true' if the last character of the source is equal to the target, 'false' otherwise.
     *
     * @author Todor Krushkov
     */
    public static boolean endsWith(String source, char target) {
        if (source == null || source.isEmpty()) {
            return false;
        }

        return source.charAt(source.length() - 1) == target;
    }

    /**
     * Returns the index of the first occurrence of the specified <code>target</code> character
     * in the <code>source</code> string. If the target character is not found, returns -1.
     *
     * @param source The string in which to search for the target character.
     * @param target The character whose first occurrence index is to be found.
     * @return The index of the first occurrence of the target character, or -1 if not found.
     *
     * @author Erkan Redzheb
     */
    public static int firstIndexOf(String source, char target) {
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Finds the last index at which the specified <code>symbol</code> appears in the given <code>source</code> string.
     *
     * @param source The string to search in.
     * @param symbol The character to find the last index of.
     * @return The index of the last occurrence of <code>symbol</code> in <code>source</code>, or -1 if not found.
     *
     * @author Martin Dimitrov
     */
    public static int lastIndexOf(String source, char symbol) {
        if (source.isEmpty()) return -1;

        int strLen = source.length();
        for (int i = 0; i < strLen; i++) {
            if (symbol == source.charAt(i)) return i;
        }

        return -1;
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

    /**
     * Pads the beginning of the given <code>source</code> string with the specified <code>paddingSymbol</code>
     * until the total length reaches <code>length</code>. If the source is already equal to or longer than
     * the specified length, it is returned unchanged.
     *
     * @param source The original string to pad.
     * @param length The desired total length after padding.
     * @param paddingSymbol The character to use for padding at the start.
     * @return A new string padded at the start with <code>paddingSymbol</code> up to the specified length,
     * or the original string if no padding is needed.
     *
     * @author Martin Dimitrov
     */
    public static String padStart(String source, int length, char paddingSymbol) {
        if (source == null || source.isEmpty()) return "";

        if (source.length() >= length) return source;

        int paddingCount = length - source.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < paddingCount; i++) {
            sb.append(paddingSymbol);
        }

        sb.append(source);

        return sb.toString();
    }

    public static String repeat(String source, int times) {
        return null;
    }

    /**
     * Reverses the characters in a given String.
     *
     * @param source The base String to be reversed
     * @return A new String with characters in reverse order;
     *
     * @author Yordan Paskalev
     */
    public static String reverse(String source) {
        if (source == null) {
            return null;
        }

        char[] chars = source.toCharArray();
        String result = "";

        for (int i = chars.length - 1; i >= 0; i--) {
            result += chars[i];
        }

        return result;
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

    public static String padEndStilyan(String input, int lenght, char padChar){
        if(input.length() >= lenght){
            return input;
        }
        StringBuilder sb = new StringBuilder(input);
        while (sb.length() < lenght){
            sb.append(padChar);
        }
        return sb.toString();
    }

    public  static String repatSD(String string,  int count){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < count; i++){
            sb.append(string);
        }
        return  sb.toString();
    }

}
