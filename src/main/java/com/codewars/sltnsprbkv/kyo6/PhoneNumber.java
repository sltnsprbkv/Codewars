package com.codewars.sltnsprbkv.kyo6;

/**
 * https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java/622b94a015fbf7005858160f
 */

public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        String numForm = "(";
        for (int i = 0; i < numbers.length; i++) {
            if (i == 3) numForm += ") ";
            else if (i == 6) numForm += "-";
            numForm += String.valueOf(numbers[i]);
        }
        return numForm;
    }
}
