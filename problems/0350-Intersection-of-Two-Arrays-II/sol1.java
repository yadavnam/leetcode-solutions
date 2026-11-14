// ==========================================================
// 350. Intersection of Two Arrays II
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 98%)
// Memory     : 44.3 MB (Beats 94%)
// Link       : https://leetcode.com/problems/intersection-of-two-arrays-ii/
// ==========================================================

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq = new int[1001];
        for(int num:nums1){
            freq[num]++;
        }
        ArrayList<Integer> ll = new ArrayList<>();
        for(int num:nums2){
            if(freq[num]>0){
                ll.add(num);
                freq[num]--;
            }
        }
        int [] res  = new int[ll.size()];
        for(int i=0;i<ll.size();i++){
            res[i] = ll.get(i);
        }
        return res;
    }
}