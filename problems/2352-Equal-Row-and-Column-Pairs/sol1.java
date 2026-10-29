// ==========================================================
// 2352. Equal Row and Column Pairs
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 31 ms (Beats 67%)
// Memory     : 49.4 MB (Beats 97%)
// Link       : https://leetcode.com/problems/equal-row-and-column-pairs/
// ==========================================================

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean equal = true;
                for (int k = 0; k < n; k++) {
                    if (grid[i][k] != grid[k][j]) {
                        equal = false;
                        break;
                    }
                }
                if (equal) {
                    count++;
                }
            }
        }
        return count;
    }
}
