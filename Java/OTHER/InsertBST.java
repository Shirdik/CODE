package Java;

public class InsertBST {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        TreeNode head = root;
        while (root != null) {
            if (root.val < val && root.right != null)
                root = root.right;
            else if (root.val < val && root.right == null) {
                root.right = new TreeNode(val);
                return head;
            } else if (root.left != null)
                root = root.left;
            else {
                root.left = new TreeNode(val);
                return head;
            }
        }
        return head;
    }

    public TreeNode insertIntoBST1(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        if (root.val < val)
            root.right = insertIntoBST(root.right, val);
        else
            root.left = insertIntoBST(root.left, val);
        return root;
    }
}
