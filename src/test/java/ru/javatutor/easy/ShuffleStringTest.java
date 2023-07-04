package ru.javatutor.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShuffleStringTest {
    ShuffleString shuffleString = new ShuffleString();
    @Test
    public void restoreString() {
        String s = shuffleString.restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3});
        assertEquals("leetcode", s);
    }
    @Test
    public void restoreString2() {
        String s = shuffleString.restoreString("abc", new int[]{0,1,2});
        assertEquals("abc", s);
    }
    @Test
    public void restoreString3() {
        String s = shuffleString.restoreString("aiohn", new int[]{3,1,4,2,0});
        assertEquals("nihao", s);
    }
    @Test
    public void restoreString4() {
        String s = shuffleString.restoreString("aaiougrt", new int[]{4,0,2,6,7,3,1,5});
        assertEquals("arigatou", s);
    }
    @Test
    public void restoreString5() {
        String s = shuffleString.restoreString("art", new int[]{1,0,2});
        assertEquals("rat", s);
    }
}