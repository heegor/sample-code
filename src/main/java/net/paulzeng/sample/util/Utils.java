package net.paulzeng.sample.util;

public class Utils {

    public static String getArrayItems(int[] array) {
        String result = "";

        for (int i = 0; i < array.length; i ++) {
            if (i > 0) {
                result += ", ";
            }
            result += array[i];
        }

        return  result;
    }
}
