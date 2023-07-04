package ru.javatutor.easy;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int sum2 = 0;
        for (int i : nums) {
            sum2 += i;
        }
        return sum - sum2;
    }

    public int missingNumber2(int[] nums) {
        Arrays.sort(nums);
        int expected = 0;
        for (int n : nums) {
            if (expected != n)
                break;
            expected++;
        }
        return expected;
    }



}
