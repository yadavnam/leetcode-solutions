// ==========================================================
// 1748. Sum of Unique Elements
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.5 MB (Beats 90%)
// Link       : https://leetcode.com/problems/sum-of-unique-elements/
// ==========================================================

class Solution {
    public int sumOfUnique(int[] nums) {
        int[] freq = new int [101];
        for(int num:nums){
            freq[num]++;
        }
        int sum = 0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==1){
                sum+=i;
            }
        }
        return sum;
    }
}