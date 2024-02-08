package com.vdovin.needcode.two_pointer;

public class Task125 {
    public static boolean isPalindrome(String s) {
        if (s.length() == 1) return true;

        String onlyCharacterStr = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int l = 0, r = onlyCharacterStr.length() - 1;
        while (l < r) {
            if (onlyCharacterStr.charAt(l) != onlyCharacterStr.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = "0P";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
    }
}
