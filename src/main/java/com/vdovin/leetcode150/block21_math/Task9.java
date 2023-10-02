package com.vdovin.leetcode150.block21_math;

public class Task9 {
    //Time: O(n)
    //Space: O(1)
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reversed = 0;
        int temp = x;
        while (temp > 0) {
            int digit = temp % 10;
            temp /= 10;
            reversed = reversed * 10 + digit;
        }
        return x == reversed;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}
