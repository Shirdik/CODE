package Java;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        if (targetSum < 0)
            return false;
        if (root.left == null && root.right == null && targetSum - root.val == 0)
            return true;
        else if (root.right == null)
            return hasPathSum(root.left, targetSum - root.val);
        else if (root.left == null)
            return hasPathSum(root.right, targetSum - root.val);
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    public boolean hasPathSum1(TreeNode root, int targetSum) {

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    public static void main(String[] args) {

    }
}
