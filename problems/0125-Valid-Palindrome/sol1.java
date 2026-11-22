// ==========================================================
// 125. Valid Palindrome
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 15 ms (Beats 22%)
// Memory     : 45.8 MB (Beats 31%)
// Link       : https://leetcode.com/problems/valid-palindrome/
// ==========================================================

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int l = 0;
        int h = s.length()-1;

        while(l<h){
            if(s.charAt(l) != s.charAt(h)) return false;
            l++;
            h--;
        }
        return true;
    }
} 