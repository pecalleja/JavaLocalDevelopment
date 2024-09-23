package org.example.arrays;

import java.util.*;

public class EncodeDecode {

    public String encode(List<String> strings) {
        StringBuilder encodedString = new StringBuilder();
        for (String s: strings) {
            encodedString.append(s);
            encodedString.append("π");
        }
        return encodedString.toString();
    }

    public List<String> decode(String string) {
        String[] decodedString = string.split("π", -1);
        return new ArrayList<>(
            Arrays.asList(decodedString).subList(
                0, decodedString.length-1
            )
        );
    }
}
