// ==========================================================
// 242. Valid Anagram
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 27 ms (Beats 5%)
// Memory     : 47 MB (Beats 6%)
// Link       : https://leetcode.com/problems/valid-anagram/
// ==========================================================

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character ,Integer > smap = new HashMap<>();
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            if(smap.containsKey(s.charAt(i))){
                smap.put(s.charAt(i) , smap.getOrDefault(s.charAt(i),0)+1);
            }
            else{
                smap.put(s.charAt(i) , 1);
            }
        }
        HashMap<Character , Integer> tmap = new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(tmap.containsKey(t.charAt(i))){
                tmap.put(t.charAt(i) , tmap.getOrDefault(t.charAt(i),0)+1);
            }
            else{
                tmap.put(t.charAt(i) ,1);
            }
        }
        for(char key:smap.keySet()){
            if(!tmap.containsKey(key)) return false;

            int val1 = smap.get(key);
            int val2 = tmap.get(key);

            if(val1!=val2) return false;
        }
        return true;
    }
}