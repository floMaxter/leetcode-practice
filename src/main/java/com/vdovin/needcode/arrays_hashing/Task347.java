package com.vdovin.needcode.arrays_hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Task347 {
    //Time: O(n log k)
    //Space: O(n)
    public int[] topKFrequent(int[] nums, int k) {
        //Count occurrences
        Map<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        //Create min heap
        Queue<Integer> minHeap = new PriorityQueue<>((a, b) -> hm.get(a) - hm.get(b));
        for (int num : hm.keySet()) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        //Add element from minHeap
        int[] res = new int[k];
        int index = 0;
        while (!minHeap.isEmpty()) {
            res[index++] = minHeap.poll();
        }
        return res;
    }


    public static void main(String[] args) {

    }
}
