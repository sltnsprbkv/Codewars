package com.codewars.sltnsprbkv.kyo6;

/**
 * https://www.codewars.com/kata/5208f99aee097e6552000148/train/java
 */

public class BreakCamelCase {
    public static String camelCase(String input) {
        String str = input;
        int j = 0;
        for (int i = 1; i < input.length(); i++) {
            char ch = str.charAt(i + j);
            if (Character.isUpperCase(ch)) {
                str = str.substring(0, i + j) + " " + str.substring(i + j);
                j++;
            }
        }
        return str;
    }
}
