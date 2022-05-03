package com.codewars.sltnsprbkv.kyo6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BreakCamelCaseTest {
    @Test
    public void tests() {
        assertEquals( "Incorrect", "camel Casing", BreakCamelCase.camelCase("camelCasing"));
        assertEquals( "Incorrect", "camel Casing Test", BreakCamelCase.camelCase("camelCasingTest"));
        assertEquals( "Incorrect", "camelcasingtest", BreakCamelCase.camelCase("camelcasingtest"));
        assertEquals( "Incorrect", "Сamelcasingtest", BreakCamelCase.camelCase("Сamelcasingtest"));
    }
}
