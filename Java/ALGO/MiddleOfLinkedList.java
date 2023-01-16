package Java.ALGO;

import Java.OTHER.ListNode;

public class MiddleOfLinkedList {
    public static ListNode middleNode(ListNode head) {
        if (head == null)
            return null;
        else {
            ListNode x = head, y = head;
            while (y.next.next != null) {
                x = x.next;
                y = y.next.next;
            }
            return y.next == null ? x : x.next;
        }

    }

}
