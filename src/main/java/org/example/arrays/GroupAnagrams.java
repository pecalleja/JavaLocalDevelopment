package org.example.arrays;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> solution(String[] strings) {
        if (strings.length == 0) return new ArrayList<>();
        Map<String, List<String>> result = new HashMap<>();
        int[] count = new int[26];
        for (String s : strings) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) count[c - 'a']++;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!result.containsKey(key)) result.put(key, new ArrayList<>());
            result.get(key).add(s);
        }
        return new ArrayList<>(result.values());
    }
}
