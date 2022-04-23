package com.codewars.sltnsprbkv.kyo6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultiplesOf3Or5Tests {
    @Test
    public void test() {
        assertEquals(23, new MultiplesOf3Or5().solution(10));
        assertEquals(33, new MultiplesOf3Or5().solution(11));
        assertEquals(33, new MultiplesOf3Or5().solution(12));
        assertEquals(45, new MultiplesOf3Or5().solution(13));
    }
}
