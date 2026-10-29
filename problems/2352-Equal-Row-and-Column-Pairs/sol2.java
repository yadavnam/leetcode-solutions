// ==========================================================
// 2352. Equal Row and Column Pairs
// Difficulty : Medium
// Language   : Java
// Solution   : #2
// Runtime    : 32 ms (Beats 58%)
// Memory     : 49.3 MB (Beats 97%)
// Link       : https://leetcode.com/problems/equal-row-and-column-pairs/
// ==========================================================

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                boolean equal = true;

                for(int k=0;k<n;k++){
                    if(grid[i][k]!=grid[k][j]){
                        equal = false;
                        break;
                    }
                }
                if(equal){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}