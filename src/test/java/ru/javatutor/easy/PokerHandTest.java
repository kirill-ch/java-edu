package ru.javatutor.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PokerHandTest {

    @Test
    void isStraight() {
        boolean result = PokerHand.isStraight(new ArrayList<>(
                Arrays.asList(2, 7, 8, 5, 10, 9, 11)));
        assertEquals(true, result);
    }

    @Test
    void isStraight2() {
        boolean result = PokerHand.isStraight(new ArrayList<>(
                Arrays.asList(14, 2, 3, 4, 5)));
        assertEquals(true, result);
    }

    @Test
    void isStraight3() {
        boolean result = PokerHand.isStraight(new ArrayList<>(
                Arrays.asList(2, 7, 8, 5, 10, 9, 12)));
        assertEquals(false, result);
    }
}