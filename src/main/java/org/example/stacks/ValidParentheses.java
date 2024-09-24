package org.example.stacks;

import java.util.*;

public class ValidParentheses {
    HashMap<Character, Character> brackets;
    public ValidParentheses() {
        this.brackets = new HashMap<>();
        this.brackets.put(')', '(');
        this.brackets.put('}', '{');
        this.brackets.put(']', '[');
    }
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (this.brackets.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != this.brackets.get(c)) return false;
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
