package com.codewars.sltnsprbkv.kyo6;

/**
 * https://www.codewars.com/kata/523f5d21c841566fde000009/train/java
 */

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {
        int[] copy = new int[a.length - 1];
        for (int i = 0; i < a.length; i++){
            for (int k : b) {
                if (a[i] != k) {
                    copy[i] = a[i];
                    break;
                }
            }
        }
        return copy;
    }
}
