package ru.javatutor.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString r = new ReverseString();
    @Test
    public void reverse() {
        assertEquals("cba", r.reverse("abc"));
        assertEquals("", r.reverse(""));
        assertEquals("a", r.reverse("a"));
        assertEquals("aaa", r.reverse("aaa"));
    }
}