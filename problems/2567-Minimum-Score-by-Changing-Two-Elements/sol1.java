// ==========================================================
// 2567. Minimum Score by Changing Two Elements
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 18 ms (Beats 75%)
// Memory     : 59.3 MB (Beats 55%)
// Link       : https://leetcode.com/problems/minimum-score-by-changing-two-elements/
// ==========================================================

class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return Math.min(nums[n-3]-nums[0], Math.min(nums[n-2]-nums[1], nums[n-1]-nums[2]));
    }
}