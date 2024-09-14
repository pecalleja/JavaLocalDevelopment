package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {
    private final TwoSum problem = new TwoSum();

    @Test
    public void case1Test() {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] result = problem.solution(numbers, target);
        assertArrayEquals(result, new int[]{0, 1});
    }
    @Test
    public void case2Test() {
        int[] numbers = {3,2,4};
        int target = 6;
        int[] result = problem.solution(numbers, target);
        assertArrayEquals(result, new int[]{1, 2});
    }
    @Test
    public void case3Test() {
        int[] numbers = {3,3};
        int target = 6;
        int[] result = problem.solution(numbers, target);
        assertArrayEquals(result, new int[]{0, 1});
    }
}