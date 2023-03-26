package org.example.kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterWithLongestConsecutiveRepetitionTest {
    @Test
    public void exampleTests() {
        assertArrayEquals(new Object[]{"a", 4}, CharacterWithLongestConsecutiveRepetition.longestRepetition("aaaabb"));
        assertArrayEquals(new Object[]{"a", 4}, CharacterWithLongestConsecutiveRepetition.longestRepetition("bbbaaabaaaa"));
        assertArrayEquals(new Object[]{"u", 3}, CharacterWithLongestConsecutiveRepetition.longestRepetition("cbdeuuu900"));
        assertArrayEquals(new Object[]{"b", 5}, CharacterWithLongestConsecutiveRepetition.longestRepetition("abbbbb"));
        assertArrayEquals(new Object[]{"a", 2}, CharacterWithLongestConsecutiveRepetition.longestRepetition("aabb"));
        assertArrayEquals(new Object[]{"", 0}, CharacterWithLongestConsecutiveRepetition.longestRepetition(""));
    }

}