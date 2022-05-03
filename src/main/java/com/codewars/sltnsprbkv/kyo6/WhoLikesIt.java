package com.codewars.sltnsprbkv.kyo6;

/**
 * https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java/
 */

class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        int countOfNames = names.length;
        return switch (countOfNames) {
            case 0 -> "no one likes this";
            case 1 -> String.format("%s likes this", names[0]);
            case 2 -> String.format("%s and %s like this", names[0], names[1]);
            case 3 -> String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default -> String.format("%s, %s and %d others like this", names[0], names[1], countOfNames - 2);
        };
    }
}
