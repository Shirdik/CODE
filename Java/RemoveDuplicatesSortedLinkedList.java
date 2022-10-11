package Java;

public class RemoveDuplicatesSortedLinkedList {
    public static ListNode removeDups(ListNode head) {
        if (head == null)
            return null;
        ListNode x = head;
        ListNode y = head.next;
        while (x.next != null) {
            if (x.val == y.val) {
                x.next = y.next;
            } else
                x = x.next;
            y = y.next;

        }
        return head;
    }

    public static void main(String[] args) {

        ListNode[] x = new ListNode[5];
        int arr[] = { 1, 1, 2, 3, 3 };
        for (int i = 0; i < x.length; i++) {
            x[i].val = arr[i];
            if (i == x.length - 1)
                x[i].next = null;
            else
                x[i].next = x[i + 1];
        }
        System.out.println(x);
        System.out.println(removeDups(x[0]));

    }
}
