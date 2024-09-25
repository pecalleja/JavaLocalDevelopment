package org.example.stacks;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class GenerateParenthesesTest {

    // Assuming the class for solving this problem is named GenerateParentheses
    GenerateParentheses problem = new GenerateParentheses();

    @Test
    void testGenerateParentheses_nEquals1() {
        List<String> expected = List.of("()");
        assertEquals(expected, problem.solution(1), "For n = 1, the only valid combination is ().");
    }

    @Test
    void testGenerateParentheses_nEquals2() {
        List<String> expected = Arrays.asList("(())", "()()");
        assertEquals(expected, problem.solution(2), "For n = 2, the valid combinations are (()) and ()().");
    }

    @Test
    void testGenerateParentheses_nEquals3() {
        List<String> expected = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        assertEquals(expected, problem.solution(3), "For n = 3, the valid combinations should be correct.");
    }

    @Test
    void testGenerateParentheses_nEquals4() {
        List<String> expected = Arrays.asList(
                "(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()", "(())(())",
                "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()");
        assertEquals(expected, problem.solution(4), "For n = 4, the valid combinations should be correct.");
    }

    @Test
    void testGenerateParentheses_nEquals0() {
        List<String> expected = List.of("");
        assertEquals(expected, problem.solution(0), "For n = 0, the only valid combination is an empty string.");
    }

    @Test
    void testGenerateParentheses_nEquals5() {
        // Valid combinations for n = 5, just an example of the test case.
        // The actual result can be fetched or computed. Just listing a few for the test.
        List<String> expected = Arrays.asList(
                "((((()))))", "(((()())))", "(((())()))", "(((()))())", "(((())))()", "((()(())))", "((()()()))"
                // Add the remaining expected combinations
        );
        List<String> result = problem.solution(5);
        assertTrue(result.containsAll(expected), "For n = 5, the valid combinations should include the expected ones.");
        assertEquals(42, result.size(), "For n = 5, the total number of valid combinations should be 42.");
    }

    @Test
    void testGenerateParentheses_nEqualsLargeInput() {
        // Just testing if it runs successfully for large inputs
        List<String> result = problem.solution(8);
        assertNotNull(result, "For n = 8, the result should not be null.");
        assertFalse(result.isEmpty(), "For n = 8, the result should not be empty.");
        assertEquals(1430, result.size(), "For n = 8, the total number of valid combinations should be 1430.");
    }

    @Test
    void testEmptyInputEdgeCase() {
        List<String> result = problem.solution(0);
        assertNotNull(result, "For n = 0, the result should not be null.");
        assertEquals(1, result.size(), "For n = 0, the result should contain exactly one element.");
        assertEquals("", result.getFirst(), "For n = 0, the only valid combination is an empty string.");
    }
}
