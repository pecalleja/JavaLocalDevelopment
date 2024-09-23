package org.example.arrays;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;



class EncodeDecodeTest {
    private final EncodeDecode problem = new EncodeDecode();

    @Test
    public void case1() {
        List<String> strings = Arrays.asList("Hello", "World");
        String message = problem.encode(strings);
        assertEquals(problem.decode(message), strings);
    }

    @Test
    public void case2() {
        List<String> strings = List.of("");
        String message = problem.encode(strings);
        assertEquals(problem.decode(message), strings);
    }
}