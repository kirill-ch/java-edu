package ru.javatutor.easy;

public class SingleNumber {
    // XOR
    public static void main(String[] args) {
        System.out.println(2^2); // x ^ x = 0
        System.out.println(1 ^ 1 ^ 2 ^ 2 ^ 3); // 3
        System.out.println(1 ^ 2 ^ 1 ^ 2 ^ 3); // 3 - порядок не важен
        // 0 ^ a = a
    }

//    Runtime: 1 ms, faster than 95.07%
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int n : nums) {
            a ^= n;
        }
        return a;
    }
}
