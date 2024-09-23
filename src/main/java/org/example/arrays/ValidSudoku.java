package org.example.arrays;

import java.util.*;

public class ValidSudoku {
    public boolean solution(char[][] board) {
        int N = 9;

        // Use hash set to record the status
        List<HashSet<Character>> rows = new ArrayList<>();
        List<HashSet<Character>> cols = new ArrayList<>();
        List<HashSet<Character>> boxes = new ArrayList<>();

        for (int r = 0; r < N; r++) {
            rows.add(new HashSet<Character>());
            cols.add(new HashSet<Character>());
            boxes.add(new HashSet<Character>());
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                char val = board[r][c];

                // Check if the position is filled with number
                if (val == '.') {
                    continue;
                }

                // Check the row
                if (rows.get(r).contains(val)) {
                    return false;
                }
                rows.get(r).add(val);

                // Check the column
                if (cols.get(c).contains(val)) {
                    return false;
                }
                cols.get(c).add(val);

                // Check the box
                int idx = (r / 3) * 3 + c / 3;
                if (boxes.get(idx).contains(val)) {
                    return false;
                }
                boxes.get(idx).add(val);
            }
        }
        return true;
    }
}
