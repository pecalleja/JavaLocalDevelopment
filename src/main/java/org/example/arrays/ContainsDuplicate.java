package org.example.arrays;

import java.util.*;

public class ContainsDuplicate {
    public boolean solution(int[] numbers){
        Set<Integer> set = new HashSet<>(numbers.length);
        for (int x: numbers){
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }
}
