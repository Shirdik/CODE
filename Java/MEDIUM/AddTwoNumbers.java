package Java.MEDIUM;

import Java.OTHER.ListNode;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int s = 0;
        ListNode r = new ListNode();
        ListNode t = r;
        while (l1 != null || l2 != null) {
            s /= 10;
            if (l1 != null) {
                s += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                s += l2.val;
                l2 = l2.next;
            }
            t.next = new ListNode(s % 10);
            t = t.next;
        }
        if (s / 10 == 1)
            t.next = new ListNode(1);
        return r.next;

    }

    public static void main(String[] args) {

    }
}
