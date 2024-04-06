package Task1;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    TreeNode prev = null;
    boolean result = true;

    public void helper(TreeNode root) {
        if (root == null)
            return;
        helper(root.left);
        if (prev == null)
            prev = root;
        else if (root.val <= prev.val)
            result = false;
        else
            prev = root;
        helper(root.right);
    }

    public boolean isValidBST(TreeNode root) {
        helper(root);
        return result;
    }
}