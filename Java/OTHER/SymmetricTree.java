package Java;

public class SymmetricTree {
    public boolean isMirror(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 != null && root2 != null && root1.val == root2.val)
            return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
        return false;

    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return false;
        return isSymmetric(root.left) == isSymmetric(root.right);
    }

    public static void main(String[] args) {

    }
}
