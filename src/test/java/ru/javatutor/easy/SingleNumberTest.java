package ru.javatutor.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {
    SingleNumber singleNumber = new SingleNumber();

    @Test
    public void singleNumber() {
        assertEquals(4, singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
//    Input: nums = [4,1,2,1,2]
//    Output: 4
}