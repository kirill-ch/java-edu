package ru.javatutor.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class OccurrencesTest {
    Occurrences occurrences = new Occurrences();
    @Test
    public void findOcurrences() {
        String[] res = occurrences.findOccurrences("alice is a good girl she is a good student", "a", "good");
        assertArrayEquals(new String[]{"girl","student"}, res);
    }
    @Test
    public void findOcurrences2() {
        String[] res = occurrences.findOccurrences("we will we will rock you", "we", "will");
        assertArrayEquals(new String[]{"we","rock"}, res);
    }
}