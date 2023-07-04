package ru.javatutor.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CamelCaseTest {
    @Test
    public void camelcase() {
        int res = CamelCase.camelcase("saveChangesInTheEditor");
        assertEquals(5, res);
    }
    @Test
    public void camelcase2() {
        int res = CamelCase.camelcase("save");
        assertEquals(1, res);
    }
}