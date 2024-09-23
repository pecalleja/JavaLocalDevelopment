package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductExceptTest {
    private final ProductExcept problem = new ProductExcept();

    @Test
    public void case1() {
        int[] numbers = {1,2,3,4};
        int[] result = problem.solution(numbers);
        int[] expected = {24,12,8,6};
        assertArrayEquals(result, expected);
    }
    @Test
    public void case2() {
        int[] numbers = {-1,1,0,-3,3};
        int[] result = problem.solution(numbers);
        int[] expected = {0,0,9,0,0};
        assertArrayEquals(result, expected);
    }
}