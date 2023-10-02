package com.vdovin.leetcode150.block21_math;

public class Task172 {
    public static int trailingZeroes(int n) {
        int sum = 0;
        while (n > 0) {
            n /= 5;
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println(trailingZeroes(n));
    }
}
