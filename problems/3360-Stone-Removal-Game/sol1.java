// ==========================================================
// 3360. Stone Removal Game
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 41.9 MB (Beats 36%)
// Link       : https://leetcode.com/problems/stone-removal-game/
// ==========================================================

class Solution {
    public boolean canAliceWin(int n) {
        int ston = 10;
        boolean aliceturn = true;

        while(n>=ston){
            n = n - ston;
            ston--;
            aliceturn = !aliceturn;
        }
        return !aliceturn;
    }
}