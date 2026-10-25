// ==========================================================
// 1614. Maximum Nesting Depth of the Parentheses
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 25%)
// Memory     : 42 MB (Beats 100%)
// Link       : https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
// ==========================================================

class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;

        for( char c:s.toCharArray()){
            if(c == '('){
                depth++;
                maxDepth = Math.max(depth , maxDepth);
            }
            else if( c == ')'){
                depth-- ;
            }
        }
        return maxDepth;
    }
}