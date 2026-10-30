// ==========================================================
// 2352. Equal Row and Column Pairs
// Difficulty : Medium
// Language   : Java
// Solution   : #4
// Runtime    : 18 ms (Beats 87%)
// Memory     : 53.8 MB (Beats 57%)
// Link       : https://leetcode.com/problems/equal-row-and-column-pairs/
// ==========================================================

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int cnt = 0;
        HashMap <List<Integer> , Integer > map = new HashMap<>();

        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(grid[i][j]);
            }
            map.put(row , map.getOrDefault(row , 0)+1);
        }
        for(int i=0;i<n;i++){
            List <Integer> col = new ArrayList<>();
            for(int j=0;j<n;j++){
                col.add(grid[j][i]);
            }
            cnt+= map.getOrDefault(col , 0);
        }
        return cnt;
    }
}