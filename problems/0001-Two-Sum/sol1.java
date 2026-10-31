// ==========================================================
// 1. Two Sum
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 99%)
// Memory     : 46.7 MB (Beats 77%)
// Link       : https://leetcode.com/problems/two-sum/
// ==========================================================

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int tar = target - nums[i];
            if(map.containsKey(tar)){
                return new int[]{map.get(tar) , i};
            }
            else{
                map.put(nums[i] , i);
            }
        }
        return new int[]{-1 , -1};
    }
}