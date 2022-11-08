package Java.OTHER;

public class SearchBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root.val == val || root == null)
            return root;
        else if (root.val < val)
            return searchBST(root.right, val);
        else
            return searchBST(root.left, val);
    }
}
