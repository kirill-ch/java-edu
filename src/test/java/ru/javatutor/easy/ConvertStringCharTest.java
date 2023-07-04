package ru.javatutor.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertStringCharTest {
    ConvertStringChar c = new ConvertStringChar();

    @Test
    public void convert() {
        String[] param = {"a", "b", "c", "*", "@", "C"};
        char[] res = {'a', 'b', 'c', '*', '@', 'C'};
        assertArrayEquals(res, c.convertSingleChar(param));
    }

    @Test
    public void convertAnyString() {
        String[] param = {"cat", "dog", "tree"};
        char[] res = {'c', 'a', 't', 'd', 'o', 'g', 't', 'r', 'e', 'e'};
        assertArrayEquals(res, c.convertAnyString(param));
    }
}