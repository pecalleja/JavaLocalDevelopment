package org.example.arrays;

import java.util.*;

public class TopKFrequent {
    public int[] solution(int[] numbers, int k) {
        if (k == numbers.length) return numbers;

        Map<Integer, Integer> counter = new HashMap<>();
        for (int i: numbers) {
            counter.put(i, counter.getOrDefault(i, 0)+1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
            Comparator.comparingInt(counter::get)
        );
        for (int i: counter.keySet()) {
            heap.add(i);
            if (heap.size() > k) heap.poll();
        }

        int[] result = new int[k];
        for (int i=k-1; i >= 0; i--) {
            Optional<Integer> value = Optional.ofNullable(heap.poll());
            result[i] = value.orElseThrow(() -> new IllegalArgumentException("No value present"));
        }
        return result;
    }
}
