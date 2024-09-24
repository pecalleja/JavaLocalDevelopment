package org.example.stacks;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {
    MinStack minStack = new MinStack();

    @Test
    void testPushAndTop() {
        minStack.push(5);
        assertEquals(5, minStack.top(), "Top element should be 5 after pushing 5.");

        minStack.push(3);
        assertEquals(3, minStack.top(), "Top element should be 3 after pushing 3.");

        minStack.push(7);
        assertEquals(7, minStack.top(), "Top element should be 7 after pushing 7.");
    }

    @Test
    void testPop() {
        minStack.push(5);
        minStack.push(3);
        minStack.push(7);

        minStack.pop();
        assertEquals(3, minStack.top(), "Top element should be 3 after popping 7.");

        minStack.pop();
        assertEquals(5, minStack.top(), "Top element should be 5 after popping 3.");
    }

    @Test
    void testGetMin() {
        minStack.push(5);
        assertEquals(5, minStack.getMin(), "Minimum element should be 5 after pushing 5.");

        minStack.push(3);
        assertEquals(3, minStack.getMin(), "Minimum element should be 3 after pushing 3.");

        minStack.push(7);
        assertEquals(3, minStack.getMin(), "Minimum element should still be 3 after pushing 7.");

        minStack.pop();
        assertEquals(3, minStack.getMin(), "Minimum element should still be 3 after popping 7.");

        minStack.pop();
        assertEquals(5, minStack.getMin(), "Minimum element should be 5 after popping 3.");
    }

    @Test
    void testPushPopGetMinSequence() {
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3, minStack.getMin(), "Minimum element should be -3.");

        minStack.pop();
        assertEquals(-2, minStack.getMin(), "Minimum element should be -2 after popping -3.");
        assertEquals(0, minStack.top(), "Top element should be 0 after popping -3.");
    }

    @Test
    void testSingleElementStack() {
        minStack.push(1);
        assertEquals(1, minStack.top(), "Top element should be 1.");
        assertEquals(1, minStack.getMin(), "Minimum element should be 1.");
        minStack.pop();
        assertThrows(EmptyStackException.class, minStack::top, "Top should throw an exception on an empty stack.");
        assertThrows(EmptyStackException.class, minStack::getMin, "getMin should throw an exception on an empty stack.");
    }

}