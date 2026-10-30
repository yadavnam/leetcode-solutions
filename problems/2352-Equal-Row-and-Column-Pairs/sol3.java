// ==========================================================
// 2352. Equal Row and Column Pairs
// Difficulty : Medium
// Language   : Java
// Solution   : #3
// Runtime    : 28 ms (Beats 70%)
// Memory     : 49.6 MB (Beats 95%)
// Link       : https://leetcode.com/problems/equal-row-and-column-pairs/
// ==========================================================

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int cnt = 0;

        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                boolean isequal = true;
                for(int i=0;i<n;i++){
                    if(grid[r][i] != grid[i][c]){
                        isequal = false;
                        break;
                    }
                }
                if(isequal == true) cnt++;
            }
        }
        return cnt;
    }
}