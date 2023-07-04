package ru.javatutor.easy;

public class ShuffleString {
    public String restoreString22(String s, int[] indices) {
        StringBuilder res = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            res.setCharAt(indices[i], s.charAt(i));
        }
        return res.toString();
    }

    public String restoreString(String s, int[] indices) {
        char[] res = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }


//    Runtime: 11 ms, faster than 5.17%
    public String restoreString2(String s, int[] indices) {
        String[] chars = s.split("");
        String[] res = new String[chars.length];
        for (int i = 0; i < indices.length; i++) {
            res[indices[i]] = chars[i];
        }
        return String.join("", res);
    }
}
