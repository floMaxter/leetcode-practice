package com.vdovin.basic_algoritms.searching;

public class BinarySearch {
    //Time: O(log n)
    //Space: O(1)
    public static int binarySearchIterative(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                r = mid - 1;
            if (nums[mid] < target)
                l = mid + 1;
        }
        return -1;
    }

    //Time: O(log n)
    //Space: O(log n)
    public static int binarySearchRecursive(int[] nums, int target, int l, int r) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target)
                return binarySearchRecursive(nums, target, mid + 1, r);
            if (nums[mid] > target)
                return binarySearchRecursive(nums, target, l, mid - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int target = 2;
        int resIter = binarySearchIterative(nums, target);
        int resRec = binarySearchRecursive(nums, target, 0, nums.length - 1);
        System.out.println("The index found in an iterative way: " + resIter);
        System.out.println("The index found in an recursive way: " + resRec);
    }
}
