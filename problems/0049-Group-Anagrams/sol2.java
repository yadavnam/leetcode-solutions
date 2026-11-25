// ==========================================================
// 49. Group Anagrams
// Difficulty : Medium
// Language   : Java
// Solution   : #2
// Runtime    : 7 ms (Beats 83%)
// Memory     : 48.8 MB (Beats 95%)
// Link       : https://leetcode.com/problems/group-anagrams/
// ==========================================================

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> mp = new HashMap<>();
        for(String s : strs){
            char [] arr = s.toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            if(!mp.containsKey(str)){
                mp.put(str , new ArrayList<>());
            }
            mp.get(str).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}