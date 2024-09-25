package org.example.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePolishTest {
    ReversePolish problem = new ReversePolish();

    @Test
    void testSimpleAddition() {
        String[] tokens = {"2", "1", "+"};
        assertEquals(3, problem.solution(tokens), "2 + 1 should be 3.");
    }

    @Test
    void testSimpleSubtraction() {
        String[] tokens = {"4", "2", "-"};
        assertEquals(2, problem.solution(tokens), "4 - 2 should be 2.");
    }

    @Test
    void testSimpleMultiplication() {
        String[] tokens = {"2", "3", "*"};
        assertEquals(6, problem.solution(tokens), "2 * 3 should be 6.");
    }

    @Test
    void testSimpleDivision() {
        String[] tokens = {"6", "3", "/"};
        assertEquals(2, problem.solution(tokens), "6 / 3 should be 2.");
    }

    @Test
    void testMultipleOperations() {
        String[] tokens = {"2", "1", "+", "3", "*"};
        assertEquals(9, problem.solution(tokens), "(2 + 1) * 3 should be 9.");
    }

    @Test
    void testWithNegativeNumbers() {
        String[] tokens = {"-2", "3", "*"};
        assertEquals(-6, problem.solution(tokens), "-2 * 3 should be -6.");
    }

    @Test
    void testWithDivisionAndNegativeNumbers() {
        String[] tokens = {"4", "-2", "/"};
        assertEquals(-2, problem.solution(tokens), "4 / -2 should be -2.");
    }

    @Test
    void testComplexExpression() {
        String[] tokens = {"5", "1", "2", "+", "4", "*", "+", "3", "-"};
        assertEquals(14, problem.solution(tokens), "5 + ((1 + 2) * 4) - 3 should be 14.");
    }

    @Test
    void testDivisionResultingInNonInteger() {
        String[] tokens = {"7", "3", "/"};
        assertEquals(2, problem.solution(tokens), "7 / 3 should truncate to 2.");
    }

    @Test
    void testSingleNumber() {
        String[] tokens = {"42"};
        assertEquals(42, problem.solution(tokens), "A single number should return itself.");
    }
}