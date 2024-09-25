package org.example.stacks;

import java.util.*;

public class GenerateParentheses {

    public List<String> solution(int n) {
        List<String> answer = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backtracking(answer, stack, 0, 0, n);
        return answer;
    }
    private void backtracking(List<String> answer, StringBuilder curString, int leftCount, int rightCount, int n
    ) {
        if (curString.length() == 2 * n) {
            answer.add(curString.toString());
            return;
        }
        if (leftCount < n) {
            curString.append("(");
            backtracking(answer, curString, leftCount + 1, rightCount, n);
            curString.deleteCharAt(curString.length() - 1);
        }
        if (leftCount > rightCount) {
            curString.append(")");
            backtracking(answer, curString, leftCount, rightCount + 1, n);
            curString.deleteCharAt(curString.length() - 1);
        }
    }
}
