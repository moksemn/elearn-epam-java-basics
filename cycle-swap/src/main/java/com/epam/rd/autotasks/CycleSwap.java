package com.epam.rd.autotasks;

import java.util.Arrays;
import java.util.Collections;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array.length > 0) {
            int[] temp = new int[array.length - 1];
            System.arraycopy(array, 0, temp, 0, array.length - 1);
            int lastElement = array[array.length - 1];
            array[0] = lastElement;
            System.arraycopy(temp, 0, array, 1, temp.length);
            System.out.println(Arrays.toString(array));
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if (array.length > 0) {
            int[] temp = new int[array.length - shift];
            System.arraycopy(array, 0, temp, 0, array.length - shift);
            int[] lastElements = new int[shift];
            System.arraycopy(array, array.length - shift, lastElements, 0, shift);
            int[] revers = new int[lastElements.length];
            for (int i = 0; i < revers.length; i++) {
                revers[i] = lastElements[lastElements.length - 1 - i];
            }
            System.arraycopy(revers, 0, array, 0, shift);
            System.arraycopy(temp, 0, array, shift, temp.length);
            System.out.println(Arrays.toString(array));
        }
    }
}
