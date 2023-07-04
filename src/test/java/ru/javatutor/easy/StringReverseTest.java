package ru.javatutor.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse stringReverse = new StringReverse();
    @Test
    public void reverse() {
        String res = stringReverse.reverse("madam");
        assertEquals("Yes", res);
    }
    @Test
    public void reverse2() {
        String res = stringReverse.reverse("madam2");
        assertEquals("No", res);
    }
}