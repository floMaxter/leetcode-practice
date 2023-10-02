package com.vdovin.leetcode150.block21_math;

public class Task66 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[n + 1];
        digits[0] = 1;

        return digits;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{1, 2, 3, 4, 5};
        printArray(plusOne(digits));
    }

    public static void printArray(int[] digits) {
        for (Integer i : digits) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
