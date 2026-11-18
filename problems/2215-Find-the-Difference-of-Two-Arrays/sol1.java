// ==========================================================
// 2215. Find the Difference of Two Arrays
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 10 ms (Beats 94%)
// Memory     : 47.2 MB (Beats 51%)
// Link       : https://leetcode.com/problems/find-the-difference-of-two-arrays/
// ==========================================================

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for(int num:nums1){
            s1.add(num);
        }
        for(int num:nums2){
            s2.add(num);
        }

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for(int num:s1){
            if(!s2.contains(num)){
                l1.add(num);
            }
        }
        for(int num:s2){
            if(!s1.contains(num)){
                l2.add(num);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(l1);
        ans.add(l2);

        return ans;
    }
}