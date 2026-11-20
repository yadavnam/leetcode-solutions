// ==========================================================
// 152. Maximum Product Subarray
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 77%)
// Memory     : 47.1 MB (Beats 50%)
// Link       : https://leetcode.com/problems/maximum-product-subarray/
// ==========================================================

class Solution {
    public int maxProduct(int[] nums) {
        int lp = 1;
        int rp = 1;
        int mp = nums[0];
        int n = nums.length;

        for(int i=0;i<nums.length;i++){

            lp = lp==0 ? 1:lp;
            rp = rp==0 ? 1:rp;

            lp *= nums[i];
            rp*= nums[n-1-i];

            mp = Math.max( mp , Math.max(lp , rp));
        }
        return mp;
    }
}