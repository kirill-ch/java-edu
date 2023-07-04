package ru.javatutor.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class DefangingIPTest {
    DefangingIP defangingIP = new DefangingIP();
    @Test
    public void defangIPaddr() {
        String res = defangingIP.defangIPaddr("255.100.50.0");
        assertEquals("255[.]100[.]50[.]0", res);
    }
}