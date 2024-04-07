package Task1;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class CheckValidBST {
    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isValidBSTHelper(TreeNode node, int minValue, int maxValue) {
        if (node == null) return true;

        if (node.val <= minValue || node.val >= maxValue) return false;

        return isValidBSTHelper(node.left, minValue, node.val) && isValidBSTHelper(node.right, node.val, maxValue);
    }

    public static void main(String[] args) {
        CheckValidBST sol = new CheckValidBST();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(sol.isValidBST(root)); 
    }
}


