// ==========================================================
// 11. Container With Most Water
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 6 ms (Beats 10%)
// Memory     : 76.7 MB (Beats 90%)
// Link       : https://leetcode.com/problems/container-with-most-water/
// ==========================================================

class Solution {
    public int maxArea(int[] height) {
        int lo = 0;
        int hi = height.length-1;
        int maxwater = 0;

        while(lo<hi){
            int h = Math.min(height[lo] , height[hi]);
            int w = hi - lo;
            int area = h*w;
            maxwater = Math.max(area , maxwater);

            if(height[lo]<height[hi])lo++;
            else hi--;
        }
        return maxwater;
    }
}