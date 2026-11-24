// ==========================================================
// 49. Group Anagrams
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 7 ms (Beats 83%)
// Memory     : 49.1 MB (Beats 78%)
// Link       : https://leetcode.com/problems/group-anagrams/
// ==========================================================

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans = new HashMap<>();

        for(String s :strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String (arr);
            if(!ans.containsKey(key)){
                ans.put(key , new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        return new ArrayList<>(ans.values());  
    }
}