package com.vdovin.needcode.arrays_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task347 {
    //Time: O(n)
    //Space: O(n)
    public static int[] topKFrequent(int[] nums, int k) {
        //Count occurrences, create hm, where key = number, value = frequency
        Map<Integer, Integer> bucket1 = new HashMap<>();
        for (int num : nums) {
            bucket1.put(num, bucket1.getOrDefault(num, 0) + 1);
        }

        //Create hm, where key = frequency, key = List<Integer> with number
        Map<Integer, List<Integer>> bucket2 = new HashMap<>();
        for (int num : bucket1.keySet()) {
            Integer elementFreq = bucket1.get(num);
            if (!bucket2.containsKey(elementFreq)) {
                bucket2.put(elementFreq, new ArrayList<>());
            }
            bucket2.get(elementFreq).add(num);
        }

        //Get the values from bucket2
        int[] res = new int[k];
        for (int i = nums.length; i >= 0; i--) {
            if (bucket2.containsKey(i)) {
                List<Integer> list = bucket2.get(i);
                for (Integer integer : list) {
                    res[--k] = integer;
                    if (k == 0) {
                        return  res;
                    }
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = new int[] {4, 4, 1, 1, 1, 2, 2, 2, 3, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}
