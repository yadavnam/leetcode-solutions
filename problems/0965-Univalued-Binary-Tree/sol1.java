// ==========================================================
// 965. Univalued Binary Tree
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.6 MB (Beats 83%)
// Link       : https://leetcode.com/problems/univalued-binary-tree/
// ==========================================================

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        if(root.left!=null && root.val!=root.left.val) return false;
        if(root.right!=null && root.val!=root.right.val) return false;
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}