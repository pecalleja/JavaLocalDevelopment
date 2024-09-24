package org.example.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    ValidParentheses problem = new ValidParentheses();

    @Test
    public void case1() {
        String s = "()";
        assertTrue(problem.solution(s));
    }
    @Test
    public void case2() {
        String s = "()[]{}";
        assertTrue(problem.solution(s));
    }
    @Test
    public void case3() {
        String s = "(]";
        assertFalse(problem.solution(s));
    }
    @Test
    public void case4() {
        String s = "([])";
        assertTrue(problem.solution(s));
    }
    @Test
    public void case5() {
        String s = "]";
        assertFalse(problem.solution(s));
    }


}