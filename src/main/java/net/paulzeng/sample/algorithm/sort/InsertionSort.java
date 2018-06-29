package net.paulzeng.sample.algorithm.sort;

import net.paulzeng.sample.util.Utils;

public class InsertionSort {

    public static void main(String[] args) {
        int[] testArray = new int[] {  3, 2, 9, 6, 0, 4, 8, 5, 7, 1  };

        System.out.println("Before sort: " + Utils.getArrayItems(testArray));

        insertionSort(testArray);

        System.out.println("After sort: " + Utils.getArrayItems(testArray));
    }

    private static int[] insertionSort(int[] unsortedArray) {
        int insertIndex;
        for (int splitter = 1; splitter < unsortedArray.length; splitter ++) {
            // Should have N - 1 rounds

            // Get the insert index
            insertIndex = splitter;
            for (int j = splitter -1; j >= 0; j --) {
                if (unsortedArray[j] > unsortedArray[splitter]) {
                    insertIndex = j;
                    continue;
                } else {
                    break;
                }
            }

            // Move the item to right
            int temp = unsortedArray[splitter];
            for (int mov = splitter; mov > insertIndex; mov --) {
                unsortedArray[mov] = unsortedArray[mov - 1];
            }
            unsortedArray[insertIndex] = temp;

            System.out.println("After round " + (splitter)+ ": " + Utils.getArrayItems(unsortedArray));
        }

        return unsortedArray;
    }
}
