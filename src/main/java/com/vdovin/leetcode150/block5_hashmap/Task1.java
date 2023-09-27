package com.vdovin.leetcode150.block5_hashmap;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    //Time: O(n^2)
    //Space: O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int[] res = new int[] {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                int secondIndex = map.get(diff);
                if (secondIndex != i) {
                    res[0] = i;
                    res[1] = secondIndex;
                }
            }
        }
        return res;
    }
}
