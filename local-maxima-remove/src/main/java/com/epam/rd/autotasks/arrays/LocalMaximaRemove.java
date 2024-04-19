package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};
        System.out.println(Arrays.toString(removeLocalMaxima(array)));

    }


    public static int[] removeLocalMaxima(int[] array) {
        boolean[] isLocalsMaximum = new boolean[array.length];
        int counterLocalMax = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isMax = false;
            if (i == 0) {
                if (array[i] > array[i + 1]) {
                    isMax = true;
                    counterLocalMax++;
                }
            }
            if (i == array.length - 1) {
                if (array[i] > array[i - 1]) {
                    isMax = true;
                    counterLocalMax++;
                }
            }
            if (i != 0 && i != array.length - 1) {
                if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                    isMax = true;
                    counterLocalMax++;
                }
            }
            isLocalsMaximum[i] = isMax;
        }
        if (counterLocalMax == 0) {
            return array;
        } else {
            int result[] = new int[array.length - counterLocalMax];
            int index = 0;
            for (int i = 0; i < isLocalsMaximum.length; i++) {
                if (isLocalsMaximum[i] == false) {
                    result[index] = array[i];
                    index++;
                }
            }
            return result;
        }
    }
}
