package ru.javatutor.easy;

public class ConvertStringChar {
    // для строк из одного символа
    public char[] convertSingleChar(String[] arr) {
        char[] res = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i].charAt(0);
        }
        return res;
    }

    // для любых строк
    public char[] convertAnyString(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString().toCharArray();
    }
}
