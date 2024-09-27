package org.example.arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidAnagramTest {
    private final ValidAnagram problem = new ValidAnagram();

    @Test
    public void case1Test() {
        String t = "anagram", s = "nagaram";
        boolean result = problem.solution(s, t);
        assertTrue(result);
    }
    @Test
    public void case2Test() {
        String t = "rat", s = "car";
        boolean result = problem.solution(s, t);
        assertFalse(result);
    }
}