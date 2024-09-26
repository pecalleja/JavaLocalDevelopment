package org.example.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DailyTemperaturesTest {
    private DailyTemperatures problem = new DailyTemperatures();

    @Test
    void testNormalCase() {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(expected, problem.solution(temperatures),
                "The result should match the expected array for the given temperatures.");
    }

    @Test
    void testAllSameTemperatures() {
        int[] temperatures = {70, 70, 70, 70, 70};
        int[] expected = {0, 0, 0, 0, 0};
        assertArrayEquals(expected, problem.solution(temperatures),
                "If all temperatures are the same, no warmer day exists, so all values should be 0.");
    }

    @Test
    void testDecreasingTemperatures() {
        int[] temperatures = {100, 90, 80, 70, 60};
        int[] expected = {0, 0, 0, 0, 0};
        assertArrayEquals(expected, problem.solution(temperatures),
                "For strictly decreasing temperatures, there are no warmer days, so all values should be 0.");
    }

    @Test
    void testIncreasingTemperatures() {
        int[] temperatures = {60, 70, 80, 90, 100};
        int[] expected = {1, 1, 1, 1, 0};
        assertArrayEquals(expected, problem.solution(temperatures),
                "For strictly increasing temperatures, the result should show a 1-day wait for each day except the last.");
    }

    @Test
    void testSingleElementArray() {
        int[] temperatures = {75};
        int[] expected = {0};
        assertArrayEquals(expected, problem.solution(temperatures),
                "For a single day, there are no future days to compare, so the value should be 0.");
    }

    @Test
    void testTwoElementsIncreasing() {
        int[] temperatures = {60, 80};
        int[] expected = {1, 0};
        assertArrayEquals(expected, problem.solution(temperatures),
                "For two increasing days, the first day should have a wait of 1, and the second day should be 0.");
    }

    @Test
    void testTwoElementsDecreasing() {
        int[] temperatures = {80, 60};
        int[] expected = {0, 0};
        assertArrayEquals(expected, problem.solution(temperatures),
                "For two decreasing days, no warmer days exist, so both values should be 0.");
    }

    @Test
    void testEdgeCaseEmptyArray() {
        int[] temperatures = {};
        int[] expected = {};
        assertArrayEquals(expected, problem.solution(temperatures),
                "For an empty array, the result should also be an empty array.");
    }

    @Test
    void testEdgeCaseLargeTemperatures() {
        int[] temperatures = {1000, 1001, 999, 1002};
        int[] expected = {1, 2, 1, 0};
        assertArrayEquals(expected, problem.solution(temperatures),
                "The solution should handle large temperature values and still return the correct number of days.");
    }

    @Test
    void testEdgeCaseNegativeTemperatures() {
        int[] temperatures = {-5, -4, -3, -2, -1};
        int[] expected = {1, 1, 1, 1, 0};
        assertArrayEquals(expected, problem.solution(temperatures),
                "The solution should handle negative temperature values and return correct results for warmer days.");
    }
}