// ==========================================================
// 3142. Check if Grid Satisfies Conditions
// Difficulty : Easy
// Language   : Java
// Solution   : #3
// Runtime    : 1 ms (Beats 98%)
// Memory     : 46 MB (Beats 95%)
// Link       : https://leetcode.com/problems/check-if-grid-satisfies-conditions/
// ==========================================================

class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (i + 1 < grid.length && grid[i][j] != grid[i + 1][j]) {
                    return false;
                }

                if (j + 1 < grid[0].length && grid[i][j] == grid[i][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}