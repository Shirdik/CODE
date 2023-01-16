package Java.ALGO;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRight {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public static Node connect(Node root) {
        if (root == null)
            return root;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                Node t = q.remove();
                if (t.left != null) {
                    q.offer(t.left);
                    q.offer(t.right);
                }
                t.next = size == 0 ? null : q.peek();
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

    }
}
