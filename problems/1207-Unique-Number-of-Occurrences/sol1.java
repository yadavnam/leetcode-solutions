// ==========================================================
// 1207. Unique Number of Occurrences
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 39%)
// Memory     : 42.7 MB (Beats 100%)
// Link       : https://leetcode.com/problems/unique-number-of-occurrences/
// ==========================================================

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        Set<Integer> st = new HashSet<>();

        for (int key : map.keySet()) {
            if (st.contains(map.get(key))) return false;
            else st.add(map.get(key));
        }
        return true;
    }
}