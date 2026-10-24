// ==========================================================
// 290. Word Pattern
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 85%)
// Memory     : 42 MB (Beats 99%)
// Link       : https://leetcode.com/problems/word-pattern/
// ==========================================================

class Solution {
    public boolean wordPattern(String pattern, String s) {
        //string array banaye based on spaces--------
        String [] words = s.split(" ");

        if(pattern.length() != words.length) return false;

        //mapping words[string] ki  patterns se--------
        HashMap <String , Character > map = new HashMap<>();

        //alread mapped character ka track rkhne ke liye----
        Set < Character > st = new HashSet<>();

        for(int i=0;i<pattern.length();i++){
            String word = words[i];
            char ch = pattern.charAt(i);

            // na to word ab tk map huva na ki character uses huva abhi tak-----
            if(!map.containsKey(word) && !st.contains(ch)){
                map.put(word , ch);
                st.add(ch);
            }
            //na toh voh word ab tak map huva na hi kisi pattern se match kr rha haii---
            else if(!map.containsKey(word) || map.get(word)!=ch)return false;
        }
        return true;
    }
}