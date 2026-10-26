// ==========================================================
// 1614. Maximum Nesting Depth of the Parentheses
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.5 MB (Beats 91%)
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