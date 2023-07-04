package ru.javatutor.easy;

import java.util.List;

public class LonelyInteger {
    public int lonelyinteger(List<Integer> a) {
        int[] arr = new int[100];
        for (Integer i : a) {
            arr[i]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1)
                return i;
        }
        return -1;
    }

}
