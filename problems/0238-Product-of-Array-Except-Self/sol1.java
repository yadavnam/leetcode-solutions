// ==========================================================
// 238. Product of Array Except Self
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 26%)
// Memory     : 64.6 MB (Beats 85%)
// Link       : https://leetcode.com/problems/product-of-array-except-self/
// ==========================================================

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int [] prefix = new int [n];
        int [] suffix = new int [n];
        int [] ans = new int[n];

        prefix[0] = 1;
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }

        suffix[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        for(int i=0;i<n;i++){
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }
}