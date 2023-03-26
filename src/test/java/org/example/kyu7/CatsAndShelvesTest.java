package org.example.kyu7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CatsAndShelvesTest {
    @Test
    @DisplayName("Test case in description")
    void sampleTest() {
        assertEquals(2, CatsAndShelves.solution(1, 5));
        assertEquals(174, CatsAndShelves.solution(404, 924));
        assertEquals(264, CatsAndShelves.solution(110, 902));
    }

}