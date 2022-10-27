package Java.EASY;

import Java.TreeNode;
import Java.TreeTraversal;

public class SortedArrayToBST {

    public static TreeNode sortedArrayToBST(int[] nums) {

        if (nums == null)
            return null;
        else if (nums.length == 1)
            return new TreeNode(nums[0]);
        else if (nums.length == 2) {
            TreeNode root = new TreeNode(nums[0]);
            root.right = new TreeNode(nums[1]);
            return root;
        }
        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = new TreeNode(nums[mid - 1]);
        root.right = new TreeNode(nums[nums.length - 1]);
        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;
        for (int i = mid - 2; i >= 0; i--) {
            leftNode.left = new TreeNode(nums[i]);
            leftNode = leftNode.left;
        }
        for (int i = nums.length - 2; i > mid; i--) {
            rightNode.left = new TreeNode(nums[i]);
            rightNode = rightNode.left;
        }
        return root;
    }

    public static TreeNode sortedBST(int nums[]) {
        return createBST(nums, 0, nums.length - 1);
    }

    public static TreeNode createBST(int nums[], int l, int h) {
        if (l > h)
            return null;
        int mid = l + (h - l) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBST(nums, 0, mid - 1);
        root.right = createBST(nums, mid + 1, h);
        return root;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 3, 4, 5 };
        System.out.println(TreeTraversal.preorderTraversal(sortedBST(nums)));
    }
}
