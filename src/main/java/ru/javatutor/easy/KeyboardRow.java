package ru.javatutor.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        char[] s1 = "qwertyuiop".toCharArray();
        char[] s2 = "asdfghjkl".toCharArray();
        char[] s3 = "zxcvbnm".toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s1) {
            map.put(c, 1);
        }
        for (char c : s2) {
            map.put(c, 2);
        }
        for (char c : s3) {
            map.put(c, 3);
        }
        List<String> l = new ArrayList<>(words.length);
        for (String word : words) {
            char[] arr = word.toCharArray();
            int row = map.get(Character.toLowerCase(arr[0]));
            boolean isGood = true;
            for (char c : arr) {
                if(row != map.get(Character.toLowerCase(c))) {
                    isGood = false;
                    break;
                }
            }
            if(isGood)
                l.add(word);
        }
        return l.toArray(new String[0]);
    }
}
