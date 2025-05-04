package com.company.core.arrays;

@SuppressWarnings({"ManualArrayCopy", "ExplicitArrayFilling"})
public class ArrayHelpers {

    public static int[] add(int[] source, int element) {
        return new int[1];
    }

    /**
     * Inserts the specified <code>element</code> at the beginning of the <code>source</code> array,
     * shifting existing elements one position to the right.
     *
     * @param source The original array into which the new element will be inserted at the start.
     * @param element The new element to insert at the first position.
     * @return A new array containing the element followed by the original source elements.
     *
     * @author Erkan Redzheb
     */
    public static int[] addFirst(int[] source, int element) {
        int[] result = new int[source.length + 1];
        result[0] = element;
        for (int i = 0; i < source.length; i++) {
            result[i + 1] = source[i];
        }
        return result;
    }

    /**
     * Appends all elements from <code>elements</code> to the end of the <code>source</code> array.
     *
     * @param source The original array to which new elements will be appended.
     * @param elements The additional elements to append to the source array.
     * @return A new array containing all elements from the source array followed by the elements array.
     *
     * @author Erkan Redzheb
     */
    public static int[] addAll(int[] source, int... elements) {
        int sourceLength = source.length;
        int elementsLength = elements.length;
        int[] result = new int[sourceLength + elementsLength];

        // Copy source elements
        for (int i = 0; i < sourceLength; i++) {
            result[i] = source[i];
        }

        // Copy new elements
        for (int i = 0; i < elementsLength; i++) {
            result[sourceLength + i] = elements[i];
        }

        return result;
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

    /**
     * Copies elements from <code>sourceArray</code> into <code>destinationArray</code>
     * up to the specified <code>count</code>. If the destination array is larger,
     * remaining positions will retain their default value (0).
     *
     * @param sourceArray The array from which elements will be copied.
     * @param destinationArray The array into which elements will be copied.
     * @param count The number of elements to copy; must not exceed the length of either array.
     *
     * @author Erkan Redzheb
     */
    public static void copy(int[] sourceArray, int[] destinationArray, int count) {
        int elementsToCopy = Math.min(Math.min(count, sourceArray.length), destinationArray.length);

        for (int i = 0; i < elementsToCopy; i++) {
            destinationArray[i] = sourceArray[i];
        }
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

    /**
     * Inserts the specified <code>element</code> into the given <code>source</code> array at the specified <code>index</code>,
     * shifting all subsequent elements to the right.
     *
     * @param source The original array into which the element will be inserted.
     * @param index The position (zero-based) at which to insert the element.
     * @param element The value to insert into the array.
     * @return A new array containing all elements of the original array, with <code>element</code> inserted at <code>index</code>.
     *
     * @author Martin Dimitrov
     */
    public static int[] insert(int[] source, int index, int element) {
        int[] newArr = new int[source.length + 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = source[i];
        }

        newArr[index] = element;

        for (int i = index; i < source.length; i++) {
            newArr[i + 1] = source[i];
        }

        return newArr;
    }

    public static boolean isValidIndex(int[] source, int index) {
        return false;
    }

    /**
     * Finds the last index at which the specified <code>target</code> appears in the given <code>source</code> array.
     *
     * @param source The array to search in.
     * @param target The value to find the last index of.
     * @return The last index at which <code>target</code> appears in <code>source</code>, or -1 if not found.
     *
     * @author Martin Dimitrov
     */
    public static int lastIndexOf(int[] source, int target) {
        if (source.length == 0) return -1;

        for (int i = source.length - 1; i >= 0; i--) {
            if (source[i] == target) {
                return i;
            }
        }

        return -1;
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
