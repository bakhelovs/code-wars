package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardGameTest {

    @Test
    void sampleTest() {
        assertEquals(8, CardGame.cardGame(10));
        assertEquals(3, CardGame.cardGame(4));
        assertEquals(2, CardGame.cardGame(5));
        assertEquals(9, CardGame.cardGame(12));
    }

}