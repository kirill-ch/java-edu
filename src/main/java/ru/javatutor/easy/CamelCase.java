package ru.javatutor.easy;

public class CamelCase {
    static int camelcase(String s) {
        String[] split = s.split("[A-Z]");
        return split.length;
    }

    static int camelcase2(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z')
                count++;
        }
        return count + 1;
    }
}
