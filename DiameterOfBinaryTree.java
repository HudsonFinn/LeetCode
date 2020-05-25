
class MoveZeros {
    /*
    Easy.
    Given a binary tree, you need to compute the length of the diameter of the
    tree. The diameter of a binary tree is the length of the longest path
    between any two nodes in a tree. This path may or may not pass through
    the root.
    */
    /*
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
    int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max = 1;
        recurseTree(root);
        return max - 1;
    }

    public int recurseTree (TreeNode root) {
        if (root == null) return 0;
        int left = recurseTree(root.left);
        int right = recurseTree(root.right);
        int maxLength = Math.max(right, left);
        max = Math.max(max, left + right + 1);
        return maxLength + 1;
    }
}}
