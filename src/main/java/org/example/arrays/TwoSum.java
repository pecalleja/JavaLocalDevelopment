package org.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] solution(int[] numbers, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(numbers[i], i);
        }
        return new int[] {};
    }
}
