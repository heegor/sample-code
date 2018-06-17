package net.paulzeng.sample.algorithm.sort;

import net.paulzeng.sample.util.Utils;

public class BubbleSortWithFlag {

    public static void main(String[] args) {
        int[] testArray = new int[] { 1, 2, 9, 6, 0, 4, 8, 5, 7, 3 };

        System.out.println("Before sort: " + Utils.getArrayItems(testArray));

        bubbleSortWithFlag(testArray);

        System.out.println("After sort " + Utils.getArrayItems(testArray));
    }

    private static int[] bubbleSortWithFlag(int[] unsortedArray) {
        int temp;
        boolean swapFlag;
        for (int round = 0; round < unsortedArray.length - 1; round ++) {
            // Should have at least N rounds

            swapFlag = false;
            for (int j = 0; j < unsortedArray.length - 1 - round; j ++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;

                    swapFlag = true;
                }
            }

            if (!swapFlag) {
                break;
            }

            System.out.println("After round " + (round + 1)+ ": " + Utils.getArrayItems(unsortedArray));
        }

        return unsortedArray;
    }
}
