package Java.OTHER;

import java.util.HashSet;
import java.util.Set;

public class TwoSumBinaryTree {

    public static boolean findTarget(TreeNode root, int k) {
        Set<Integer> s = new HashSet<>();
        return dfs(root, s, k);
    }

    private static boolean dfs(TreeNode root, Set<Integer> s, int k) {
        if (root == null)
            return false;
        if (s.contains(k - root.val))
            return true;
        s.add(root.val);
        return dfs(root.left, s, k) || dfs(root.right, s, k);
    }

    public static void main(String[] args) {

    }
}
