package ru.javatutor.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReorderDataLogFilesTest {
    ReorderDataLogFiles reorderDataLogFiles = new ReorderDataLogFiles();
    @Test
    public void reorderLogFiles() {
        String[] res = reorderDataLogFiles.reorderLogFiles(new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"});
        assertArrayEquals(new String[]{"let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6"}, res);
    }
    @Test
    public void reorderLogFiles2() {
        String[] res = reorderDataLogFiles.reorderLogFiles(new String[]{"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"});
        assertArrayEquals(new String[]{"g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"}, res);
    }

    @Test
    public void reorderLogFiles3() {
        String[] res = reorderDataLogFiles.reorderLogFiles(new String[]{"a b"});
        assertArrayEquals(new String[]{"a b"}, res);
    }

//    Example 1:
//
//    Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
//    Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
//    Explanation:
//    The letter-log contents are all different, so their ordering is "art can", "art zero", "own kit dig".
//    The digit-logs have a relative order of "dig1 8 1 5 1", "dig2 3 6".
//    Example 2:
//
//    Input: logs = ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
//    Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
}