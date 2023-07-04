package ru.javatutor.easy;

//    https://www.hackerrank.com/challenges/java-string-reverse/problem
public class StringReverse {
    public String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString()) ? "Yes" : "No";
    }
}
