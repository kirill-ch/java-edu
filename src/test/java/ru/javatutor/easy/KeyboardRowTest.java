package ru.javatutor.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class KeyboardRowTest {

    @Test
    public void findWords() {
        KeyboardRow k = new KeyboardRow();
        String[] words = k.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        assertArrayEquals(new String[]{"Alaska", "Dad"}, words);
    }
}