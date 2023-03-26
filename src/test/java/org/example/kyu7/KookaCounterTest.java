package org.example.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KookaCounterTest {
    @Test
    public void examples() {
        assertEquals(0, KookaCounter.kookaCounter(""));
        assertEquals(1, KookaCounter.kookaCounter("hahahahaha"));
        assertEquals(2, KookaCounter.kookaCounter("hahahahahaHaHaHa"));
        assertEquals(3, KookaCounter.kookaCounter("HaHaHahahaHaHa"));
    }

}