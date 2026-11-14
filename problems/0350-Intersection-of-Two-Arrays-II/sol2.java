// ==========================================================
// 350. Intersection of Two Arrays II
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 3 ms (Beats 94%)
// Memory     : 44.7 MB (Beats 71%)
// Link       : https://leetcode.com/problems/intersection-of-two-arrays-ii/
// ==========================================================

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num:nums1){
            map.put(num , map.getOrDefault(num , 0)+1);
        }
        ArrayList<Integer> ll = new ArrayList<>();
        for(int num:nums2){
            if(map.getOrDefault(num ,0)>0){
                ll.add(num);
                map.put(num ,map.getOrDefault(num , 0)-1);
            }
        }
        int[] res = new int[ll.size()];
        for(int i=0;i<ll.size();i++){
            res[i] = ll.get(i);
        }
        return res;
    }
}