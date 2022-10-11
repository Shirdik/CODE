package Java;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {

        if (head == null)
            return null;
        ListNode x = head;
        ListNode y = head.next;
        while (y.next != null) {
            ListNode temp = new ListNode(x.val, x.next);
            y.next = x;
            x = y;
            y = temp.next;
        }
        head.next = null;
        x.next = head;
        return x;
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
