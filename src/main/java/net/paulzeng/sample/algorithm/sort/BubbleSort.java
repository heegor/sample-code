package net.paulzeng.sample.algorithm.sort;

import net.paulzeng.sample.util.Utils;

public class BubbleSort {

    public static void main(String[] args) {
        int[] testArray = new int[] {  1, 2, 9, 6, 0, 4, 8, 5, 7, 3  };

        System.out.println("Before sort: " + Utils.getArrayItems(testArray));

        bubbleSort(testArray);

        System.out.println("After sort " + Utils.getArrayItems(testArray));
    }

    private static int[] bubbleSort(int[] unsortedArray) {
        int temp;
        for (int round = 0; round < unsortedArray.length - 1; round ++) {
            // Should have N - 1 rounds

            for (int j = 0; j < unsortedArray.length - 1 - round; j ++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                }
            }

            System.out.println("After round " + (round + 1)+ ": " + Utils.getArrayItems(unsortedArray));
        }

        return unsortedArray;
    }

}
