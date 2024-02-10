package com.vdovin.different_topics.prefix_sum;

public class Task1588 {
    public static int sumOddLengthSubarrays(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int startSeq = arr.length - i;
            int endSeq = i + 1;

            int totalFreq = startSeq * endSeq;
            int oddFreq = totalFreq % 2 == 0 ? totalFreq / 2 : totalFreq / 2 + 1;

            res += arr[i] * oddFreq;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 4, 2, 5, 3};
        int[] arr2 = new int[] {1, 2};
        int[] arr3 = new int[] {10, 11, 12};
        System.out.println(sumOddLengthSubarrays(arr1));
        System.out.println(sumOddLengthSubarrays(arr2));
        System.out.println(sumOddLengthSubarrays(arr3));
    }
}
