// ==========================================================
// 4097. Minimum Value of Merged Integers
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 6 ms (Beats 42%)
// Memory     : 44.9 MB (Beats 68%)
// Link       : https://leetcode.com/problems/minimum-value-of-merged-integers/
// ==========================================================

class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i += 2) {
            String s = "" + nums[i] + nums[i + 1];
            int val = Integer.parseInt(s);
            min = Math.min(min, val);
        }
        return min;
    }
}