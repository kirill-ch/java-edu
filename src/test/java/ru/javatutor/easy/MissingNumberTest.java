package ru.javatutor.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumberTest {

    MissingNumber missingNumber = new MissingNumber();
    @Test
    public void missingNumber() {
        int res = missingNumber.missingNumber(new int[]{3,0,1});
        assertEquals(2, res);
    }
    @Test
    public void missingNumber2() {
        int res = missingNumber.missingNumber(new int[]{0,1});
        assertEquals(2, res);
    }
    @Test
    public void missingNumber3() {
        int res = missingNumber.missingNumber(new int[]{9,6,4,2,3,5,7,0,1});
        assertEquals(8, res);
    }
    @Test
    public void missingNumber4() {
        int res = missingNumber.missingNumber(new int[]{0});
        assertEquals(1, res);
    }
}