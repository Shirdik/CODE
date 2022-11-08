package Java.OTHER;

import java.util.HashSet;
import java.util.Set;

public class LinkedHasCycle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle1(ListNode head) {
        if (head == null)
            return false;
        Set<ListNode> address = new HashSet<ListNode>();
        while (head.next != null) {
            if (address.contains(head))
                return true;
            address.add(head);
            head = head.next;
        }

        return false;
    }

    public static boolean hasCycle2(ListNode head) {
        if (head == null)
            return false;
        ListNode x = head;
        ListNode y = head;
        while (y != null && y.next != null) {
            x = x.next;
            y = y.next.next;
            if (x == y)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
