package org.example.arrays;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class GroupAnagramsTest {
    private final GroupAnagrams problem = new GroupAnagrams();

    @Test
    public void case1() {
        String[] strings = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = problem.solution(strings);
        List<List<String>> expected = Arrays.asList(
            List.of("bat"),
            Arrays.asList("tan", "nat"),
            Arrays.asList("eat", "tea", "ate")
        );
        assertEquals(expected, result);
    }

    @Test
    public void case2() {
        String[] strings = {""};
        List<List<String>> result = problem.solution(strings);
        List<List<String>> expected = List.of(List.of(""));
        assertEquals(expected, result);
    }

    @Test
    public void case3() {
        String[] strings = {"a"};
        List<List<String>> result = problem.solution(strings);
        List<List<String>> expected = List.of(List.of("a"));
        assertEquals(expected, result);
    }
}