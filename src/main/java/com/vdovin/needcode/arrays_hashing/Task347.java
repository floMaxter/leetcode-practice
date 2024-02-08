package com.vdovin.needcode.arrays_hashing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task347 {
    //Time: O(n)
    //Space: O(n)
    public static int[] topKFrequent(int[] nums, int k) {
        //Count occurrences, create hm, where key = number, value = frequency
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        //Sorted value by frequency
        List<Map.Entry<Integer, Integer>> sortedList = freqMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .toList();
        //Add frequently encountered values to an arr
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = sortedList.get(i).getKey();
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = new int[] {4, 4, 1, 1, 1, 2, 2, 2, 3, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}
