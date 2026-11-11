// ==========================================================
// 45. Jump Game II
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 100%)
// Memory     : 46.8 MB (Beats 83%)
// Link       : https://leetcode.com/problems/jump-game-ii/
// ==========================================================

class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int l = 0;
        int r = 0;
        int n = nums.length;
        while(r<n-1){
            int farthest = 0;
            for(int i = l ;i<=r ;i++){
                farthest = Math.max(i+nums[i] , farthest);
            }
            l = r+1;
            r = farthest;
            jumps++;
        }
        return jumps;
    }
}