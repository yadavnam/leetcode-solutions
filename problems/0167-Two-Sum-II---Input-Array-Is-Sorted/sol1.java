// ==========================================================
// 167. Two Sum II - Input Array Is Sorted
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 17%)
// Memory     : 48.3 MB (Beats 35%)
// Link       : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// ==========================================================

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length-1;

        while(lo<=hi){
            int sum = nums[lo] +nums[hi];

            if(sum == target){
                return new int[]{lo+1 , hi+1};
            }
            else if(sum>target){
                sum -= nums[hi];
                hi--;
            }
            else{
                sum-=nums[lo];
                lo++;
            }
        }
        return new int []{-1,-1};
    }
}