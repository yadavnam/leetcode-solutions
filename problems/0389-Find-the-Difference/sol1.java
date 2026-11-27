// ==========================================================
// 389. Find the Difference
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 54%)
// Memory     : 42.5 MB (Beats 89%)
// Link       : https://leetcode.com/problems/find-the-difference/
// ==========================================================

class Solution {
    public char findTheDifference(String s, String t) {
        int sums = 0;
        for(int i=0;i<s.length();i++){
            sums += s.charAt(i);
        }
        int sumt = 0;
        for(int i=0;i<t.length();i++){
            sumt += t.charAt(i);
        }
        return (char)(sumt-sums);
    }
}