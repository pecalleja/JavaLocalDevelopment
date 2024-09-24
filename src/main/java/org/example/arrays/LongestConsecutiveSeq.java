package org.example.arrays;

import java.util.*;

public class LongestConsecutiveSeq {
    public Integer solution(Integer[] numbers) {
        if (numbers.length == 0) return 0;
        Set<Integer> set = new HashSet<>(Arrays.asList(numbers));
        int longestStreak = 0;
        for (Integer n : set) {
            if (!set.contains(n - 1)) {
                int currentNum = n;
                int currentStreak = 1;
                while (set.contains(currentNum + 1)){
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(currentStreak, longestStreak);
            }
        }
        return longestStreak;
    }
}
