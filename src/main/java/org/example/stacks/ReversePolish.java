package org.example.stacks;

import java.util.function.BiFunction;
import java.util.*;


public class ReversePolish {
    private static final Map<
            String,
            BiFunction<Integer, Integer, Integer>
            > OPERATIONS = new HashMap<>();

    static {
        OPERATIONS.put("+", Integer::sum);
        OPERATIONS.put("-", (a, b) -> a - b);
        OPERATIONS.put("*", (a, b) -> a * b);
        OPERATIONS.put("/", (a, b) -> a / b);
    }

    public int solution(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (!OPERATIONS.containsKey(token)) {
                stack.push(Integer.valueOf(token));
                continue;
            }

            int number2 = stack.pop();
            int number1 = stack.pop();
            BiFunction<Integer, Integer, Integer> operation;
            operation = OPERATIONS.get(token);
            int result = operation.apply(number1, number2);
            stack.push(result);
        }

        return stack.pop();
    }
}
