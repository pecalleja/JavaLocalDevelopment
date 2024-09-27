package org.example.arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateTest {
    private final ContainsDuplicate problem = new ContainsDuplicate();

    @Test
    public void case1Test() {
        int[] numbers = {1,2,3,1};
        boolean result = problem.solution(numbers);
        assertTrue(result);
    }
    @Test
    public void case2Test() {
        int[] numbers = {1,2,3,4};
        boolean result = problem.solution(numbers);
        assertFalse(result);
    }
    @Test
    public void case3Test() {
        int[] numbers = {1,1,1,3,3,4,3,2,4,2};
        boolean result = problem.solution(numbers);
        assertTrue(result);
    }
}