package com.codewars.sltnsprbkv.kyo6;

/**
 * https://www.codewars.com/kata/514b92a657cdc65150000006/train/java/6263f3879eeaac004ba254e9
 */

public class MultiplesOf3Or5 {

    public int solution(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) sum += i;
        }
        return sum;
    }
}
