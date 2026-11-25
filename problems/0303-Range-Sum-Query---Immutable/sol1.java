// ==========================================================
// 303. Range Sum Query - Immutable
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 7 ms (Beats 100%)
// Memory     : 47.2 MB (Beats 69%)
// Link       : https://leetcode.com/problems/range-sum-query-immutable/
// ==========================================================

class NumArray {
    private int[] prefix;

    public NumArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        prefix = nums;
    }
    
    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */