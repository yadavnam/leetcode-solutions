// ==========================================================
// 53. Maximum Subarray
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 100%)
// Memory     : 76.9 MB (Beats 56%)
// Link       : https://leetcode.com/problems/maximum-subarray/
// ==========================================================

class Solution {
    public int maxSubArray(int[] nums) {
        int currsum = 0;
        int maxsum = nums[0];

        for(int i=0;i<nums.length;i++){
            currsum = Math.max(nums[i] , currsum+nums[i]);
            maxsum = Math.max(maxsum, currsum);
        }
        return maxsum;
    }
}