package ru.javatutor.easy;

import java.util.ArrayList;
import java.util.List;

public class Occurrences {
    public String[] findOccurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> l = new ArrayList<>();
        for (int i = 0; i < words.length - 2; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second))
                l.add(words[i + 2]);
        }
        return l.toArray(new String[0]);
    }
}
