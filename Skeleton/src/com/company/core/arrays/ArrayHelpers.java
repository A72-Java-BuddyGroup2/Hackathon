package com.company.core.arrays;

@SuppressWarnings({"ManualArrayCopy", "ExplicitArrayFilling"})
public class ArrayHelpers {

    public static int[] add(int[] source, int element) {
        return new int[1];
    }

    public static int[] addFirst(int[] source, int element) {
        return new int[1];
    }

    public static int[] addAll(int[] source, int... elements) {
        return new int[1];
    }

    public static boolean contains(int[] source, int element) {
        return false;
    }

    public static void copy(int[] sourceArray, int[] destinationArray, int count) {

    }

    public static void copyFrom(int[] sourceArray, int sourceStartIndex,
                                int[] destinationArray, int destStartIndex, int count) {

    }

    public static void fill(int[] source, int element) {

    }

    /**
     * Finds <code>integer</code>'s first occurrence index in an <code>integer array</code>.
     *
     * @param source The integer array to search
     * @param target The integer that we look for
     * @return The index of the first occurrence of the target in source. If not found return -1
     *
     * @author Kristiyan Tanchev
     */
    public static int firstIndexOf(int[] source, int target) {
        int result = -1;
        for (int i = 0; i < source.length; i++) {
            if (source[i] == target){
                result = i;
                break;
            }
        }
        return result;
    }

    public static int[] insert(int[] source, int index, int element) {
        return new int[1];
    }

    public static boolean isValidIndex(int[] source, int index) {
        return false;
    }

    public static int lastIndexOf(int[] source, int target) {
        return 0;
    }

    public static int[] removeAllOccurrences(int[] source, int element) {
        return new int[1];
    }

    public static void reverse(int[] arrayToReverse) {
    }

    public static int[] section(int[] source, int startIndex, int endIndex) {
        return new int[1];
    }

}
