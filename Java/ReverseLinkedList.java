package Java;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {

        if (head == null)
            return null;
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }

    public static void main(String[] args) {
        ListNode e = new ListNode(5);
        ListNode d = new ListNode(4, e);
        ListNode c = new ListNode(3, d);
        ListNode b = new ListNode(2, c);
        ListNode a = new ListNode(1, b);
        // ListNode x = a;
        // while (x != null) {
        // System.out.println(x.val);
        // x = x.next;
        // }
        reverseList(a);

    }

}
