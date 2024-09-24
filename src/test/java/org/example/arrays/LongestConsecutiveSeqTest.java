package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSeqTest {
    private final LongestConsecutiveSeq problem = new LongestConsecutiveSeq();

    @Test
    public void case1() {
        Integer[] numbers = {100,4,200,1,3,2};
        Integer result = problem.solution(numbers);
        assertEquals(result, 4);
    }
    @Test
    public void case2() {
        Integer[] numbers = {0,3,7,2,5,8,4,6,0,1};
        Integer result = problem.solution(numbers);
        assertEquals(result, 9);
    }
    @Test
    public void case3() {
        Integer[] numbers = {1};
        Integer result = problem.solution(numbers);
        assertEquals(result, 1);
    }

    @Test
    public void case4() {
        Integer[] numbers = {};
        Integer result = problem.solution(numbers);
        assertEquals(result, 0);
    }
    @Test
    public void case5() {
        Integer[] numbers = {-1, -2, -3, -4, -5, 1, 2};
        Integer result = problem.solution(numbers);
        assertEquals(result, 5);
    }
    @Test
    public void case6() {
        Integer[] numbers = {10, 30, 20};
        Integer result = problem.solution(numbers);
        assertEquals(result, 1);
    }
}