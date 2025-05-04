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

    /**
     * Checks if source contains element
     * @param source int[] - The array to check in
     * @param element int - the elements to check for
     * @return boolean - 'true' if source contains the element, otherwise 'false'
     *
     * @author Vasil Shopov
     */
    public static boolean contains(int[] source, int element) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == element) {
                return true;
            }
        }
        return false;
    }


    public static void copy(int[] sourceArray, int[] destinationArray, int count) {

    }

    /**
     * Copies elements from sourceArray, starting from sourceStartIndex into destinationArray, starting from
     * destStartIndex, taking count elements.
     * @param sourceArray int[] - The array to copy from
     * @param sourceStartIndex int - The starting index in sourceArray
     * @param destinationArray int[] - The array to copy to
     * @param destStartIndex int - The starting index in destinationArray
     * @param count int - The number of elements to copy
     * @return - void
     *
     * @author Vasil Shopov
     */
    public static void copyFrom(int[] sourceArray, int sourceStartIndex,
                                int[] destinationArray, int destStartIndex, int count) {
        for (int i = 0; i < count; i++) {
            destinationArray[destStartIndex + i] = sourceArray[sourceStartIndex + i];
        }
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
