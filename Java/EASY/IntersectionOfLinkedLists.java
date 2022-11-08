package Java.EASY;

import java.util.ArrayList;
import java.util.List;

import Java.OTHER.RemoveLinkedLIstElements.ListNode;

public class IntersectionOfLinkedLists {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<ListNode> list = new ArrayList<>();
        while (headA.next != null) {
            list.add(headA.next);
            headA = headA.next;
        }
        while (headB.next != null) {
            if (list.contains(headB))
                return headB;
            headB = headB.next;
        }
        return null;

    }

    public static ListNode getIntersectionNode1(ListNode headA, ListNode headB) {

        ListNode x = headA;
        ListNode y = headB;

        while (x != y) {
            x = x == null ? headB : x.next;
            y = y == null ? headA : y.next;
        }

        return x;

    }

    public static void main(String[] args) {

    }
}
