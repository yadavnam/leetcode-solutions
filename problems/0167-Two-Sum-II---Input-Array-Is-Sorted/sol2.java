// ==========================================================
// 167. Two Sum II - Input Array Is Sorted
// Difficulty : Medium
// Language   : Java
// Solution   : #2
// Runtime    : 2 ms (Beats 98%)
// Memory     : 48 MB (Beats 61%)
// Link       : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// ==========================================================

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length-1;

        while(lo<hi){
            int sum = nums[lo] +nums[hi];

            if(sum == target){
                return new int[]{lo+1 , hi+1};
            }
            else if(sum>target){
                hi--;
            }
            else{
                lo++;
            }
        }
        return new int []{-1,-1};
    }
}