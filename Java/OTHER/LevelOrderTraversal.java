package Java.OTHER;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> l = new ArrayList<>();

        if (root == null)
            return l;
        q.offer(root);

        while (!q.isEmpty()) {
            int ln = q.size();
            List<Integer> t = new LinkedList<>();
            for (int i = 0; i < ln; i++) {
                if (q.peek().left != null)
                    q.offer(q.peek().left);
                if (q.peek().right != null)
                    q.offer(q.peek().right);
                t.add(q.poll().val);
            }
            l.add(t);
        }
        return l;

    }

    public static void main(String[] args) {

    }
}