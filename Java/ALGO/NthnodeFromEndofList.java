package Java.ALGO;

import Java.OTHER.ListNode;

public class NthnodeFromEndofList {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null)
            return null;
        else {
            ListNode z = new ListNode(0), x = z, y = z;
            z.next = head;
            int i = 0;
            while (y != null) {
                if (i++ > n)
                    x = x.next;
                y = y.next;
            }
            x.next = x.next.next;
            return z.next;
        }
    }
}
