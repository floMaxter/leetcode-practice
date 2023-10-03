package com.vdovin.leetcode150.block18_binarySearch;

public class Task74 {
    //Time: O(n * m)
    //Space: O(1)
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 99;
        System.out.println(searchMatrix(matrix, target));

        int[][] matrix2 = new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,50}};
        int target2 = 11;
        System.out.println(searchMatrix(matrix2, target2));
    }
}
