package com.vdovin.different_topics.searching.binary_search;

public class Task69 {
    //Time: O(log n)
    //Space: O(1)
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int l = 1, r = x;
        int mid = -1;
        while (l <= r) {
            mid = l + (r - l) / 2;
            long mult = (long) mid * mid;
            if (mult == (long)x)
                return mid;
            if (mult < x)
                l = mid + 1;
            if (mult > x)
                r = mid - 1;
        }
        return r;
    }
}
