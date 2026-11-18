// ==========================================================
// 217. Contains Duplicate
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 19 ms (Beats 52%)
// Memory     : 107.5 MB (Beats 66%)
// Link       : https://leetcode.com/problems/contains-duplicate/
// ==========================================================

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}