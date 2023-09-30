package com.vdovin.different_topics.searching.binary_search;

public class Task367 {
    public boolean isPerfectSquare(int x) {
        int l = 1, r = x;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long multMid = (long) mid * mid;
            if (multMid == x)
                return true;
            if (multMid < x)
                l = mid + 1;
            if (multMid > x)
                r = mid - 1;
        }
        return false;
    }
}
