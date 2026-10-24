// ==========================================================
// 202. Happy Number
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 80%)
// Memory     : 41.4 MB (Beats 100%)
// Link       : https://leetcode.com/problems/happy-number/
// ==========================================================

class Solution {
    public boolean isHappy(int n) {
        while (n != 1 && n!=4) {
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            n = sum;
        }

        return n == 1;
    }
}