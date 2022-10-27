package Java;

public class RemoveLinkedLIstElements {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        public ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return head;
        while (head.val == val && head.next != null)
            head = head.next;
        if (head.val == val && head.next == null)
            return null;

        if (head != null && head.next != null) {
            ListNode prevNode = head;
            ListNode currentNode = head.next;
            while (currentNode != null) {
                if (currentNode.val == val)
                    prevNode.next = currentNode.next;
                else
                    prevNode = prevNode.next;
                currentNode = currentNode.next;
            }
        }
        return head;

    }

    public static ListNode removeElements2(ListNode head, int val) {
        if (head == null)
            return null;

        if (head.val == val)
            return removeElements2(head.next, val);

        ListNode prevNode = head;
        ListNode currentNode = head.next;
        while (currentNode != null) {
            if (currentNode.val == val)
                prevNode.next = currentNode.next;
            else
                prevNode = prevNode.next;
            currentNode = currentNode.next;
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
