package org.example.kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DoubleValueEveryNextCallTest {

    @Test
    void basicTests() {
        assertEquals(1, DoubleValueEveryNextCall.getNumber());
        assertEquals(2, DoubleValueEveryNextCall.getNumber());
        assertEquals(4, DoubleValueEveryNextCall.getNumber());
        assertEquals(8, DoubleValueEveryNextCall.getNumber());
        assertEquals(16, DoubleValueEveryNextCall.getNumber());
    }

}