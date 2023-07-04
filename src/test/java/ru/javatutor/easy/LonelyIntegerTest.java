package ru.javatutor.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LonelyIntegerTest {
    LonelyInteger lonelyInteger = new LonelyInteger();

    @Test
    public void lonelyinteger() {
        assertEquals(2, lonelyInteger.lonelyinteger(Arrays.asList(0, 0, 1, 2, 1)));
    }
//    0 0 1 2 1 => 2
}