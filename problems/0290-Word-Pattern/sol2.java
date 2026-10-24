// ==========================================================
// 290. Word Pattern
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 1 ms (Beats 85%)
// Memory     : 42.1 MB (Beats 97%)
// Link       : https://leetcode.com/problems/word-pattern/
// ==========================================================

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] words = s.split(" ");

        if(words.length!=pattern.length()) return false;

        HashMap <String , Character > map = new HashMap<>();
        Set <Character> set = new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            String word = words[i];
            char ch = pattern.charAt(i);

            if(!map.containsKey(word) && !set.contains(ch)){
                map.put(word , ch);
                set.add(ch);
            }
            else if(!map.containsKey(word) || map.get(word)!=ch)return false;
        }
        return true;
    }
}