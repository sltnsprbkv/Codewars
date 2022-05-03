package com.codewars.sltnsprbkv.kyo6;

/**
 * https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java/
 */

public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder numForm = new StringBuilder("(");
        for (int i = 0; i < numbers.length; i++) {
            if (i == 3) numForm.append(") ");
            else if (i == 6) numForm.append("-");
            numForm.append(numbers[i]);
        }
        return numForm.toString();
    }
}
