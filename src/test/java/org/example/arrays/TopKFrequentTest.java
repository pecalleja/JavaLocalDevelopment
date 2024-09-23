package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TopKFrequentTest {
    private final TopKFrequent problem = new TopKFrequent();

    @Test
    public void case1() {
        int[] numbers = {1,1,1,2,2,3};
        int[] result = problem.solution(numbers, 2);
        int[] expected = {1, 2};
        assertArrayEquals(result, expected);
    }
    @Test
    public void case2() {
        int[] numbers = {1};
        int[] result = problem.solution(numbers, 1);
        int[] expected = {1};
        assertArrayEquals(result, expected);
    }
    @Test
    public void case3() {
        int[] numbers = {3,0,1,0};
        int[] result = problem.solution(numbers, 1);
        int[] expected = {0};
        assertArrayEquals(result, expected);
    }
}