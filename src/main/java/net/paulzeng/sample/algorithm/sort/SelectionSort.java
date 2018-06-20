package net.paulzeng.sample.algorithm.sort;

import net.paulzeng.sample.util.Utils;

public class SelectionSort {
    public static void main(String[] args) {
        int[] testArray = new int[] {  3, 2, 9, 6, 0, 4, 8, 5, 7, 1  };

        System.out.println("Before sort: " + Utils.getArrayItems(testArray));

        selectionSort(testArray);

        System.out.println("After sort " + Utils.getArrayItems(testArray));
    }

    private static int[] selectionSort(int[] unsortedArray) {
        int minIndex;
        for (int round = 0; round < unsortedArray.length; round ++) {
            // Should have N rounds

            minIndex = round;

            for (int j = round + 1; j < unsortedArray.length; j ++) {
                if (unsortedArray[minIndex] > unsortedArray[j]) {
                    minIndex = j;
                }
            }

            if (minIndex != round) {
                int temp = unsortedArray[minIndex];
                unsortedArray[minIndex] = unsortedArray[round];
                unsortedArray[round] = temp;
            }

            System.out.println("After round " + (round + 1)+ ": " + Utils.getArrayItems(unsortedArray));
        }

        return unsortedArray;
    }
}
