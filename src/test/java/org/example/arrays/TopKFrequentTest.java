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

}