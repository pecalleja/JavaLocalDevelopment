package org.example.stacks;

import java.util.*;

public class DailyTemperatures {
    public int[] solution(int[] temps) {
        int l = temps.length;
        int[] ans = new int[l];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int curr=0; curr < l; curr++) {
            int currentTemp = temps[curr];
            while (!stack.isEmpty() && temps[stack.peek()] < currentTemp) {
                int prev = stack.pop();
                ans[prev] = curr - prev;
            }
            stack.push(curr);
        }
        return ans;
    }
}
