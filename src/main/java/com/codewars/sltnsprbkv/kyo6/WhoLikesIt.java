package com.codewars.sltnsprbkv.kyo6;

/**
 * https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java/622b9775db3671005348f6d1
 */

class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        int countOfNames = names.length;
        switch (countOfNames) {
            case 0: return "no one likes this";
            case 1: return String.format("%s likes this", names[0]);
            case 2: return String.format("%s and %s like this", names[0], names[1]);
            case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default: return String.format("%s, %s and %d others like this", names[0], names[1], countOfNames - 2);
        }
    }
}
