package ru.javatutor.easy;

import java.util.Arrays;

public class ReorderDataLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (log1, log2) -> {
            char lastChar1 = log1.charAt(log1.length() - 1);
            char lastChar2 = log2.charAt(log2.length() - 1);
            boolean isLog1Letter = Character.isLetter(lastChar1);
            boolean isLog2Letter = Character.isLetter(lastChar2);
            if(isLog1Letter && !isLog2Letter)
                return -1;
            if(!isLog1Letter && isLog2Letter)
                return 1;
            if(isLog1Letter) {
                int id1Length = log1.indexOf(' ');
                int id2Length = log2.indexOf(' ');
                String content1 = log1.substring(id1Length + 1);
                String content2 = log2.substring(id2Length + 1);
                if(content1.equals(content2)){
                    String id1 = log1.substring(0, id1Length);
                    String id2 = log2.substring(0, id2Length);
                    return id1.compareTo(id2);
                }
                return content1.compareTo(content2);
            }
            return 0;
        });
        return logs;
    }
}
