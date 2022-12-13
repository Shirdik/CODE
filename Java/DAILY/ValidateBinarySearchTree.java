package Java.DAILY;

import Java.OTHER.TreeNode;

public class ValidateBinarySearchTree {

    public static boolean isValidBST(TreeNode root) {

        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isValidBST(TreeNode root, Long min, Long max) {
        if (root == null)
            return true;
        if (root.val >= min || root.val <= min)
            return false;
        return isValidBST(root.left, min, Long.valueOf(root.val))
                && isValidBST(root.right, Long.valueOf(root.val), max);
    }

    public static void main(String[] args) {

    }

}
