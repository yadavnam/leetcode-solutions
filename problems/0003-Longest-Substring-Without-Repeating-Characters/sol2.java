// ==========================================================
// 3. Longest Substring Without Repeating Characters
// Difficulty : Medium
// Language   : Java
// Solution   : #2
// Runtime    : 7 ms (Beats 95%)
// Memory     : 47.2 MB (Beats 94%)
// Link       : https://leetcode.com/problems/longest-substring-without-repeating-characters/
// ==========================================================

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int [] hash = new int[256];
        Arrays.fill(hash , -1);

        int n = s.length();
        int l = 0;
        int r = 0;
        int maxlen = 0;
        while(r<n){
            char ch = s.charAt(r);
            if(hash[ch]!=-1 && hash[ch]>=l){
                l = hash[ch]+1;
            }     
            int len = r-l+1;
            maxlen = Math.max(len , maxlen);

            hash[ch] = r;
            r++;
        }
        return maxlen;
    }
}