package com.vdovin.basic_algoritms.sorting;

public class BubbleSort {
    //Time: O(n * ((n + 1) / 2 ))
    //Space: O(1)
    public static int bubbleSort(int[] nums) {
        int countIteration = 0;
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    swapped = true;
                }
                countIteration++;

                if (!swapped) {
                    break; //Если прошли по всему массиву и не произвели
                           // ни одной перестановки, то массив отсортирован
                }
            }
        }
        return countIteration;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{6, 5, 4, 3, 2, 1};
        int[] nums2 = new int[]{1, 2, 3, 4, 5, 6};
        int count = bubbleSort(nums2);
        printArray(nums2);
        System.out.println("Count iteration: " + count);
    }

    public static void printArray(int[] nums) {
        for (Integer i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void swap(int[] nums, int l, int r) {

    }
}
